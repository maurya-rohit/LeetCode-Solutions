class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,Set<Character>> rowChar=new HashMap<>();
         Map<Integer,Set<Character>> columnChar=new HashMap<>();
        Map<Integer,Set<Character>> gridChar=new HashMap<>();
       for (int i = 0; i<9; i++){
     for (int j = 0; j<9; j++){
       if(!(board[i][j]=='.')){
          if(rowChar.containsKey(i)){
              Set<Character> currentRowChar=rowChar.get(i);
              if(currentRowChar.contains(board[i][j])){
                  return false;
              }else{
                  System.out.println("Added Row"+ board[i][j]+" "+ i);
                  currentRowChar.add(board[i][j]);
                  rowChar.put(i,currentRowChar);
              }
          }else{
              Set<Character> currentRowChar=new HashSet<>();
              System.out.println("Created Row"+ board[i][j]+" "+ i);
              currentRowChar.add(board[i][j]);
              rowChar.put(i,currentRowChar);
          }
            if(columnChar.containsKey(j)){
              Set<Character> currentColumnChar=columnChar.get(j);
              if(currentColumnChar.contains(board[i][j])){
                  return false;
              }else{
                  currentColumnChar.add(board[i][j]);
                  columnChar.put(j,currentColumnChar);
              }
          }else{
              Set<Character> currentColumnChar=new HashSet<>();
                currentColumnChar.add(board[i][j]);
              columnChar.put(j,currentColumnChar);
          }if(i<3 && j<3){
                if(gridChar.containsKey(0)){
              Set<Character> currentGridChar=gridChar.get(0);
              if(currentGridChar.contains(board[i][j])){
                  return false;
              }else{
                  currentGridChar.add(board[i][j]);
                  gridChar.put(0,currentGridChar);
              }
          }else{
              Set<Character> currentGridChar=new HashSet<>();
                currentGridChar.add(board[i][j]);
              gridChar.put(0,currentGridChar);
          }
            }else if(i<3 && j>2 && j<6){
                if(gridChar.containsKey(1)){
              Set<Character> currentGridChar=gridChar.get(1);
              if(currentGridChar.contains(board[i][j])){
                  return false;
              }else{
                  currentGridChar.add(board[i][j]);
                  gridChar.put(1,currentGridChar);
              }
          }else{
              Set<Character> currentGridChar=new HashSet<>();
                currentGridChar.add(board[i][j]);
              gridChar.put(1,currentGridChar);
          }
            } else if(i<3 && j>5){
                if(gridChar.containsKey(2)){
              Set<Character> currentGridChar=gridChar.get(2);
              if(currentGridChar.contains(board[i][j])){
                  return false;
              }else{
                  currentGridChar.add(board[i][j]);
                  gridChar.put(2,currentGridChar);
              }
          }else{
              Set<Character> currentGridChar=new HashSet<>();
                currentGridChar.add(board[i][j]);
              gridChar.put(2,currentGridChar);
          }
            } else if(i>2 && i<6 && j<3){
                if(gridChar.containsKey(3)){
              Set<Character> currentGridChar=gridChar.get(3);
              if(currentGridChar.contains(board[i][j])){
                  return false;
              }else{
                  currentGridChar.add(board[i][j]);
                  gridChar.put(3,currentGridChar);
              }
          }else{
              Set<Character> currentGridChar=new HashSet<>();
                currentGridChar.add(board[i][j]);
              gridChar.put(3,currentGridChar);
          }
            }else if(i>2 && i<6 && j>2 && j<6){
                if(gridChar.containsKey(4)){
              Set<Character> currentGridChar=gridChar.get(4);
              if(currentGridChar.contains(board[i][j])){
                  return false;
              }else{
                  currentGridChar.add(board[i][j]);
                  gridChar.put(4,currentGridChar);
              }
          }else{
              Set<Character> currentGridChar=new HashSet<>();
                currentGridChar.add(board[i][j]);
              gridChar.put(4,currentGridChar);
          }
            }else if(i>2 && i<6 && j>5){
                if(gridChar.containsKey(5)){
              Set<Character> currentGridChar=gridChar.get(5);
              if(currentGridChar.contains(board[i][j])){
                  return false;
              }else{
                  currentGridChar.add(board[i][j]);
                  gridChar.put(5,currentGridChar);
              }
          }else{
              Set<Character> currentGridChar=new HashSet<>();
                currentGridChar.add(board[i][j]);
              gridChar.put(5,currentGridChar);
          }
            }else if(i>5 && j<3){
                if(gridChar.containsKey(6)){
              Set<Character> currentGridChar=gridChar.get(6);
              if(currentGridChar.contains(board[i][j])){
                  return false;
              }else{
                  currentGridChar.add(board[i][j]);
                  gridChar.put(6,currentGridChar);
              }
          }else{
              Set<Character> currentGridChar=new HashSet<>();
                currentGridChar.add(board[i][j]);
              gridChar.put(6,currentGridChar);
          }
            }else if(i>5 && j>2 && j<6){
                if(gridChar.containsKey(7)){
              Set<Character> currentGridChar=gridChar.get(7);
              if(currentGridChar.contains(board[i][j])){
                  return false;
              }else{
                  currentGridChar.add(board[i][j]);
                  gridChar.put(7,currentGridChar);
              }
          }else{
              Set<Character> currentGridChar=new HashSet<>();
                currentGridChar.add(board[i][j]);
              gridChar.put(7,currentGridChar);
          }
            }else if(i>5 && j>5){
                if(gridChar.containsKey(8)){
              Set<Character> currentGridChar=gridChar.get(8);
              if(currentGridChar.contains(board[i][j])){
                  return false;
              }else{
                  currentGridChar.add(board[i][j]);
                  gridChar.put(8,currentGridChar);
              }
          }else{
              Set<Character> currentGridChar=new HashSet<>();
                currentGridChar.add(board[i][j]);
              gridChar.put(8,currentGridChar);
          }
            }
           }
       }
     }
        return true;
}
        
    }
