class Solution {
    public int firstUniqChar(String s) {
        Map<Integer,Integer> charMap=new HashMap<>();
        for(char c: s.toCharArray()){
            if(charMap.containsKey((int)c)){
                int i= charMap.get((int)c);
                charMap.put((int)c,i+1);
            }else{
            charMap.put((int)c,1);
            }
        }
        int j=0;
        for(char c:s.toCharArray()){
            int i= charMap.get((int)c);
            if(i==1){
                return j; 
            }
            j++;
                               }
        return -1;
                               }
                               }
                               
                               
