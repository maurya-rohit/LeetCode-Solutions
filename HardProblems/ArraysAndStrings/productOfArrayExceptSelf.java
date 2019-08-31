class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] answer=new int[nums.length];
        Arrays.fill(answer,1);
        int temp=1;
        for(int i=0;i<nums.length;i++){
            answer[i]=temp;
            temp=temp*nums[i];
        }
        temp=1;
        for(int i=nums.length-1;i>=0;i--){
            answer[i]=answer[i]*temp;
            temp=temp*nums[i];
        }
        return answer;
    }
}
