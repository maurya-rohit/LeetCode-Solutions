class Solution {
    public int maxSubArray(int[] nums) {
     int ultimateMax=nums[0];
        int maxThis=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]+maxThis>nums[i]){
                maxThis=nums[i]+maxThis;
            }else{
                maxThis=nums[i];
            }
            if(ultimateMax<maxThis){
                ultimateMax=maxThis;
            }
        }
        return ultimateMax;
}
}
