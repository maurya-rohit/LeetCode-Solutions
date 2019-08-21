class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length<1) return 0;
        int ultimateMax=0;
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=0;i<nums.length;i++){
            int max=0;
            for(int j=i-1;j>=0;j--){
                 if(nums[j]<nums[i]){
                    if(dp[j]>max){
                        max=dp[j];
                    }
                }
            }
            dp[i]=max==0?1:max+1;
            if(ultimateMax<dp[i])
                ultimateMax=dp[i];
        }
        return ultimateMax;
    }
}
