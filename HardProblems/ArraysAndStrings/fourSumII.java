class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int result=0;
        Map<Integer,Integer> s1=new HashMap<>();
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                int sum=A[i]+B[j];
                s1.put(sum,s1.getOrDefault(sum,0)+1);
            }
        }
        for(int i=0;i<C.length;i++){
            for(int j=0;j<D.length;j++){
                int sum=C[i]+D[j];
                if(s1.containsKey(-sum)){
                    result+=s1.get(-sum);
                }
            }
        }
        return result;
    }
}
