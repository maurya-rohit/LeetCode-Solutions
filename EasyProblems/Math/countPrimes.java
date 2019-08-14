class Solution {
    public int countPrimes(int n) {
        if(n<2) return 0;
        if(n==2) return 0;
        int count=0;
        int[] primes=new int[n+1];
        Arrays.fill(primes,1);
        for(int i=2;i<n;i++){
            if(primes[i]==1){
                count++;
                for(int j=i*2;j<n; j += i) {
                    primes[j]=0;
                }
            }
        }
        primes[0]=0;
        primes[1]=0;
        return count;
    }
}
