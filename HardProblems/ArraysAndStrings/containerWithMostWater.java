class Solution {
    public int maxArea(int[] height) {
       int answer=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
           int thisAnswer=Math.min(height[left],height[right])*(right-left);
            if(thisAnswer>answer)
                answer=thisAnswer;
            if(height[left]<height[right]){
                left++;
            }else
                right--;
        }
        return answer;
    }
}
