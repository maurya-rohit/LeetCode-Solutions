class Solution {
    public int climbStairs(int n) {
        int first=1;
        int second=2;
        if(n==1) return 1;
        if(n==2) return 2;
        int answer=0;
        for (int i=3;i<=n;i++){
            answer=first+second;
            first=second;
            second=answer;
        }
        return answer;
    }
}
