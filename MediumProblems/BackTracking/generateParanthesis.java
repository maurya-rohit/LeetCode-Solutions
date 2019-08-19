class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> answer=new ArrayList<>();
        if(n==0) return answer;
        return generate(answer,0,0,n,"");
    }
    public List<String> generate(List<String> answer, int start,int close,int size,String current){
        if(current.length()>=size*2){
            answer.add(current);
            return answer;
        }else{
            if(start<size){
                generate(answer,start+1,close,size,current+"(");
            } 
             if(close<start){
                generate(answer,start,close+1,size,current+")");
            }
        }
        return answer;
    }
}
