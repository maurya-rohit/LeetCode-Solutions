class Solution {
    public void moveZeroes(int[] nums) {
        int len=nums.length;
        int pos=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }else{
                nums[pos]=nums[i];
                pos++;
            }
        }
        while(count>0){
            nums[pos]=0;
            pos++;
            count--;
        }
    }
}
