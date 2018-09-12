class Solution {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        else if(n==2)
            return "11";
            
        int i=0;
        String oldString="11";
        String newString="11";
        while(i<n-2){
         newString= checkAnd(oldString);
            oldString=newString;
            i++;
        }
        return newString;
    }
    
    public String checkAnd(String str){
        int count =1;
        StringBuilder build=new StringBuilder();
        char prev=str.charAt(0);
        for(int i=1;i<str.length();i++){
            char next = str.charAt(i);
            if(next==prev){
                count ++;
            }else{
                build.append(count).append(prev);
                count=1;
                prev=next;
            }
        }
        build.append(count).append(prev);
        return build.toString();
    }
}
