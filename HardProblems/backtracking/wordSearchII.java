class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> ans=new ArrayList<>();
     for(int i=0;i<words.length;i++){
        
         String word=words[i];
          //System.out.println(word);
         for(int j=0;j<board.length;j++){
             boolean answer=false;
             for(int k=0;k<board[0].length;k++){
                 if(word.charAt(0)==board[j][k]){
                    // System.out.println(word);
                      answer=check(board,word,j,k,0);
                     if(answer){
                         if(!ans.contains(word)){
                         ans.add(word);
                         }
                         break;
                     }
                 }
                 if(answer)
                     break;
             }
         }
     }
        return ans;
    }
    
    public boolean check(char[][] board,String word,int i ,int j,int index){
    
        if(index==word.length())
            return true;
        if(i<0 || i>board.length-1 || j<0 || j>board[0].length-1){
            return false;
        }
        else if(word.charAt(index)==board[i][j]){
            char temp = board[i][j];
            board[i][j]='.';
            boolean ans=(check(board,word,i+1,j,index+1) || check(board,word,i-1,j,index+1) || check(board,word,i,j+1,index+1) || check(board,word,i,j-1,index+1));
            board[i][j]=temp;
            return ans;
        }
        else{
            return false;
        }
    }
}
