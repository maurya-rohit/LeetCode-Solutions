class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        int carry= 0;
      if(len==1 && digits[0]==9){
          int[] arr= new int[2];
          arr[0]=1;
          arr[1]=0;
          return arr;
          
      }else if(len==1){
          digits[0]=digits[0]+1;
          return digits;
          
      }
        for(int i=len-1;i>=0;i--){
            if(i==len-1){
                 if(digits[i]+1>9){
                digits[i]=0;
                carry=1;
            }
                else{
                    digits[i]=digits[i]+1;
                    carry=0;
                 }
            }else if(i==0){
                if(digits[i]+ carry > 9){
                    int[] arr=new int[len+1];
                    arr[0]=1;
                    digits[i]=0;
                    for(int j=0;j<len;j++){
                        arr[j+1]=digits[j];
                        return arr;
                    }
                }else{
                digits[i]=digits[i]+carry;
                    return digits;
                }
                
            }
            else{
              //  System.out.println("Checkrk");
                if(digits[i]+carry>9){
                    digits[i]=0;
                    carry=1;
                }
                else{
                    digits[i]=digits[i]+carry;
                    carry=0;
                }
            }
           }
         return digits;
    }
}
