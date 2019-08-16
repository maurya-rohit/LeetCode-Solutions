class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3) return false;
    int min=nums[0];
       int mid=Integer.MIN_VALUE;
        int old_min=nums[0];
        int old_mid=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                if(mid!=Integer.MIN_VALUE){
                old_min=min;
                old_mid=mid;
                }
                min=nums[i];
                mid=Integer.MIN_VALUE;
                
            }else if(nums[i]>min){
                if(old_mid!=Integer.MIN_VALUE && nums[i]> old_mid && nums[i]>old_min) return true;
                
                if(mid==Integer.MIN_VALUE) mid=nums[i];
                else if(nums[i]>mid) return true;
                else mid=nums[i];
                
                
            }
        }
        return false;
        
       
    }
}
