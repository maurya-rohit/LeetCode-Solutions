class Solution {
      public String longestCommonPrefix(String[] strs) {
   if(strs.length==0)
       return "";
          String answer=calculatePrefix(strs,0,strs.length-1);
          return answer;
}
  public String calculatePrefix(String[] strs, int l,int r){
        if(l==r)
            return strs[l];
        else{
            int mid=(l+r)/2;
            String leftWala= calculatePrefix(strs,l,mid);
            String rightWala=calculatePrefix(strs,mid+1,r);
           return actualCompare(leftWala,rightWala);
        }
    }
    public String actualCompare(String leftWala,String rightWala){
        int min = Math.min(leftWala.length(),rightWala.length());
        for(int j=0;j<min;j++){
            if(leftWala.charAt(j)!=rightWala.charAt(j)){
                return leftWala.substring(0,j);
            }
        }
        return leftWala.substring(0,min);
    }
}
