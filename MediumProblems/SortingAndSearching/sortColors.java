class Solution {
    public void sortColors(int[] nums) {
      int left=-1;
        int mid=0;
        int right=nums.length;
        while(mid<right){
            if(nums[mid]==0){
                left++;
                int temp=nums[left];
                nums[left]=0;
                nums[mid]=temp;
                if(left==mid)mid++;
            }else if(nums[mid]==2){
                right--;
                int temp=nums[right];
                nums[right]=2;
                nums[mid]=temp;
            }else 
            {mid++;
            }
        }
    }
}
