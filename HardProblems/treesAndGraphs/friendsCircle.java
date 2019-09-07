class Solution {
    public int findCircleNum(int[][] M) {
        int answer=0;
        for(int i=0;i<M.length;i++){
            for(int j=i;j<M[0].length;j++){
               if(M[i][j]==1)
               {
                   M[i][j]=0;
                  check(M,i,j);
                   answer++;
               }
                }
                
            }
          return answer;
        }
    
    public void check(int[][] M,int i,int j){
       Set<Integer> set=new HashSet<>();
        for(int row=i;row<M.length;row++){
            if(M[row][j]==1){
                M[row][j]=0;
                set.add(row);
            }
        }
        for(int col:set){
            check(M,0,col);
        }
        return;
    }
}
