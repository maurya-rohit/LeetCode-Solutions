class Solution {
    public boolean exist(char[][] board, String word) {
        if(board.length*board[0].length<word.length()) 
            return false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean ans=check(board,i,j,word,0);
                    if(ans){
                        return ans;
                    }
                }
            }
        }
        return false;
    }
    public boolean check(char[][] board,int i,int j,String word,int index){
        if(index==word.length())
            return true;
        else if(i>=0 && i<board.length && j>=0 && j<board[0].length && (word.charAt(index)==board[i][j])){
            char t=board[i][j];
        board[i][j]='.';
          boolean ans= (check(board,i-1,j,word,index+1) || check(board,i+1,j,word,index+1) || check(board,i,j-1,word,index+1) || check(board,i,j+1,word,index+1));
            board[i][j]=t;
            return ans;
        }
        else{
            return false;
        }
    }
     
}
