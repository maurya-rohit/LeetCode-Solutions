class Solution {
    public void rotate(int[][] matrix) {
        Map<Integer,List<Integer>> rowsMap=new HashMap<>();
      for (int i = 0; i<matrix.length; i++){
          List<Integer> rowSet=new ArrayList<>();
     for (int j = 0; j<matrix.length; j++){
         rowSet.add(matrix[i][j]);
        }
          rowsMap.put(i,rowSet);
}  
        int row=0;
        for (int col = matrix.length-1; col>=0; col--){
         List<Integer> rowSet=rowsMap.get(row);
         int k=0;
         for(int s: rowSet){
             matrix[k][col]=s;
             k++;
         }
            row++;
        
}  
    }
}
