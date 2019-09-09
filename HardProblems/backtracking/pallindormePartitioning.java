class Solution {
    public List<List<String>> partition(String s) {
      List<List<String>> answer=new ArrayList<>();
        check(s,0,new ArrayList<>(),answer);
        return answer;
    }
    
    public void check(String s, int start,List<String> tempList,List<List<String>> answer){
        if(start==s.length()){
            answer.add(new ArrayList<>(tempList));
        }
        for(int i=start;i<s.length();i++){
            if(isPallindrome(s,start,i)){
tempList.add(s.substring(start,i+1));
                check(s,i+1,tempList,answer);
                tempList.remove(tempList.size()-1);
            }
        }
    }
    public boolean isPallindrome(String s, int i ,int j){
        while(i<j){
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }else
                return false;
        }
        return true;
    }
}
