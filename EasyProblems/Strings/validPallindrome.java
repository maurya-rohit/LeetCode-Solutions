class Solution {
    public boolean isPalindrome(String s) {
char[] charArray=new char[s.length()];
        int i=0;
        for(char c: s.toCharArray()){
            if(((int)c > 64 && (int)c < 123) || ((int)c > 47 && (int)c < 58)){
                if((int)c >90 && (int) c < 97){
                    continue;
                }else{
                charArray[i]=c;
                i++;
                }
            }
        }
        String newString=new String(charArray);
        newString=newString.trim();
        StringBuilder input1 = new StringBuilder();
        input1.append(newString);
        input1.reverse();
        System.out.println(input1.toString());
        return newString.equalsIgnoreCase(input1.toString());
        
    }
}
