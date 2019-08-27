class Solution {
    public int titleToNumber(String s) {
        int answer=0;
        
        for(int i=0;i<s.length();i++){
            answer*=26;
            answer+=(s.charAt(i)-'A')+1;
        }
       return answer;
}
}
