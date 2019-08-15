class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1) return 1;
        int thisCount=0;
        int maxCount=0;
        char[] chars=s.toCharArray();
         List<Character> charList=new ArrayList<>();
        for(int i=0;i<chars.length;i++){
           if(!charList.contains(chars[i])){
                thisCount++;
                charList.add(chars[i]);
            }else{
                if(thisCount>maxCount){
                    maxCount=thisCount;
                }
                thisCount=charList.size()-charList.indexOf(chars[i]);
                int j=charList.indexOf(chars[i]);
               while(j>=0){
                   charList.remove(j);
                   j--;
               }
              
                charList.add(chars[i]);
            }
        }
        if(thisCount>1 && thisCount>maxCount){
            maxCount=thisCount;
        }
        return maxCount;
    }
}
