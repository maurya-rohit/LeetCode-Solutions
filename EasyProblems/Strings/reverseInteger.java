class Solution {
    public int reverse(int x) {
      boolean positive = true;
        if(x<0){
            positive=false;
            x=-x;
        }
        if(x == 0){
            return 0;
        }
        int result=0;
        int previous=0;
       while(x>0){
          int i=x%10;
           result=(result*10)+i;
           if((result)/10!=previous ){
               return 0;
           }
           previous=result;
           x=x/10;
       }
        if(positive){
            return result;
        }else{
            return -result;
        }
    }
}
