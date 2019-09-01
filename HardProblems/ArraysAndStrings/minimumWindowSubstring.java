class Solution {
    public String minWindow(String s, String t) {
       if(s.length()==0 || t.length()==0) return "";
        int[] ans=new int[3];
        ans[0]=-1;
        ans[1]=ans[2]=0;
        Map<Character,Integer> word=new HashMap<>();
        for(int i=0;i<t.length();i++){
            int count=word.getOrDefault(t.charAt(i),0);
            word.put(t.charAt(i),count+1);
        }
        Map<Character,Integer> window=new HashMap<>();
        int required=word.size();
        int formed=0;
        int l=0,r=0;
        while(r<s.length()){
            char k=s.charAt(r);
            int count=window.getOrDefault(k,0);
            window.put(k,count+1);
            if(word.containsKey(k) && word.get(k).intValue()==window.get(k).intValue()){
                formed++;
            }
            while(l<=r && required==formed){
                char j=s.charAt(l);
                if(ans[0]==-1 || ans[0]>=r-l+1){
                ans[0]=r-l+1;
                ans[1]=l;
                ans[2]=r;
               }
            count=window.get(j);
            window.put(j,count-1);
                
            if(word.containsKey(j) && word.get(j)>window.get(j)){
                formed--;
            }
                l++;
            }
        r++;
        }
        return ans[0]==-1?"":s.substring(ans[1],ans[2]+1);
    }
}
