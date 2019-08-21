class Solution {
    public boolean canJump(int[] nums) {
       int[] dp=new int[nums.length];
        Arrays.fill(dp,0);
        dp[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            int furtherIndex=Math.min(i+nums[i],nums.length-1);
            for(int j=i+1;j<=furtherIndex;j++){
                if(dp[j]==1){
                    dp[i]=1;
                    break;
                }
            }
        }
        return dp[0]==1;
    }
    
}
