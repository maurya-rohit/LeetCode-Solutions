class Solution {
    public void solve(char[][] board) {
        if(board.length==0) return ;
        if (board.length < 2 || board[0].length < 2)
		return;
        int m=board.length;
        int n=board[0].length;
       for(int i=0;i<m;i++){
           if(board[i][0]=='O')
               check(i,0,board);
           if(board[i][n-1]=='O'){
               check(i,n-1,board);
           }
       }
        
         for(int i=0;i<n;i++){
           if(board[0][i]=='O')
               check(0,i,board);
           if(board[m-1][i]=='O'){
               check(m-1,i,board);
           }
       }
        for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			if (board[i][j] == 'O')
				board[i][j] = 'X';
			else if (board[i][j] == '*')
				board[i][j] = 'O';
		}
	}
        return;
    }
    public void check(int i,int j,char[][] board){
        if(i<0 || j<0 || i>board.length-1 || j>board[0].length-1)
            return;
        if(board[i][j]=='O'){
            board[i][j]='*';
            }
        if(i>1 && board[i-1][j]=='O'){
            check(i-1,j,board);
        }
        if(i<board.length-2 && board[i+1][j]=='O'){
            check(i+1,j,board);
    }
    
    if(j>1 && board[i][j-1]=='O'){
        check(i,j-1,board);
    }
    if(j<board[0].length-2 && board[i][j+1]=='O'){
        check(i,j+1,board);
    }
    
}
}
