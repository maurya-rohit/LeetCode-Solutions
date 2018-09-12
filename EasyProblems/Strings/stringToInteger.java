class Solution {
    public int myAtoi(String str) {
        int n=str.length();
        int number=0;
        int prev=0;
        boolean started =false;
        boolean negative=false;
        int i=0;
        while (i<n){
            if(str.charAt(i)==' ' && !started){
                
            }else if(Character.isDigit(str.charAt(i))){
                prev=number;
                number=(number*10) + ((int)str.charAt(i)-48);
                started =true;
                if((number/10)!=prev){
                    if(negative){
                        return Integer.MIN_VALUE;
                    }else
                        return Integer.MAX_VALUE;
                }
            }else if(str.charAt(i)=='-' && !started){
                negative=true;
                started=true;
            }else if(str.charAt(i)=='+' & !started){
                negative=false;
                started=true;
            }else{
                if(!started)
                    return 0;
                else {
                    break;
                }
            }
            i++;
        }
        if(negative)
            return -number;
        else 
            return number;
   
    }
}
