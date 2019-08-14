class Solution {
    public int romanToInt(String s) {
        int num=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<s.toCharArray().length;i++){
            if(arr[i]=='I'){
                if(i==arr.length-1){
                    num=num+1;
                }
                else if(arr[i+1]=='V'){
                num=num+4;
                i++;
                }else if(arr[i+1]=='X'){
                    num=num+9;
                    i++;
                }else{
                    num=num+1;
                }
            }
            else if(arr[i]=='X'){
                if(i==arr.length-1){
                    num=num+10;
                }
                else if(arr[i+1]=='L'){
                num=num+40;
                i++;
                }else if(arr[i+1]=='C'){
                    num=num+90;
                    i++;
                }else{
                    num=num+10;
                }
            }
          else if(arr[i]=='C'){
              if(i==arr.length-1){
                    num=num+100;
                }
                else if(arr[i+1]=='D'){
                num=num+400;
                i++;
                }else if(arr[i+1]=='M'){
                    num=num+900;
                    i++;
                }else{
                    num=num+100;
                }
            } else if(arr[i]=='D'){
                num=num+500;
            }else if(arr[i]=='M'){
                num=num+1000;
            } else if(arr[i]=='L'){
              num=num+50;
          }else if(arr[i]=='V'){
              num=num+5;
          }
        }
        return num;
    }
}
