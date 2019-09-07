class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord))
            return 0;
        Set<String> words=new HashSet<>(wordList);
        Queue<String> q=new LinkedList<>();
        q.offer(beginWord);
        int answer=1;
        while(!q.isEmpty()){
            int size=q.size();
            for(int j=0;j<size;j++){
                String current=q.poll();
                if(current.equals(endWord))
                    return answer;
                else{
                    check(current,words,q);
                   
                }
               }
              answer++;
        }
        return 0;
    }
    
    public void check(String current,Set<String> words,Queue<String> q){
        int diff=0;
        Set<String> buffer=new HashSet<>();
       for(String s:words){
           if(valid(s,current)){
               q.offer(s);
               buffer.add(s);
           }
       }
        for(String s:buffer){
            words.remove(s);
        }
    }
    
    public boolean valid(String s,String current){
        int diff=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=current.charAt(i)){
                diff++;
            }
        }
        return diff==1;
    }
}
