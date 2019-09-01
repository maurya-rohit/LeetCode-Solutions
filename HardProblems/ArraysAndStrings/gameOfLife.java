class Solution {
    public void gameOfLife(int[][] board) {
        int[][] answer=new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                int sum=check(i-1,j-1,board)+check(i-1,j,board)+check(i-1,j+1,board)+check(i,j-1,board)+check(i,j+1,board)+check(i+1,j-1,board)+check(i+1,j,board)+check(i+1,j+1,board);
                if(board[i][j]==0 && sum==3){
                    answer[i][j]=1;
                }else if(board[i][j]==1 && sum>1 && sum<4){
                    answer[i][j]=1;
                }else if(board[i][j]==1 && (sum<2 || sum>3)){
                    answer[i][j]=0;
                }else
                    answer[i][j]=board[i][j];
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
            board[i][j]=answer[i][j];
            }
        }
        return;
    }
    public int check(int i,int j,int[][] board){
        
        if(i<0 || i>=board.length || j<0 || j>=board[0].length){
            return 0;
        }else{
            if(board[i][j]==1){
                return 1;
            }else
                return 0;
        }
    }
}
