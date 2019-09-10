class Solution {
    Set<String> valid=new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        int left=0;
        int right=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                left++;
            }else if(s.charAt(i)==')'){
                right=left==0?right+1:right;
                left=left>0?left-1:left;
            }
        }
        check(s,0,0,0,left,right,new StringBuilder());
        return new ArrayList<String>(this.valid);
    }
    
    public void check(String s, int index,int leftCount,int rightCount,int leftRem,int rightRem,StringBuilder res){
        if(index==s.length()){
            if(leftRem==0 && rightRem==0){
                this.valid.add(new String(res.toString()));
            }
        }else{
            char c = s.charAt(index);
            int len=res.length();
            if((c=='(' && leftRem>0) || (c==')' && rightRem>0) ){
                check(s,index+1,leftCount,rightCount,leftRem-(c=='('?1:0),rightRem-(c==')'?1:0),res);
            }
            res.append(c);
            if(c!='(' && c!=')')
                check(s,index+1,leftCount,rightCount,leftRem,rightRem,res);
            else if(c=='('){
                check(s,index+1,leftCount+1,rightCount,leftRem,rightRem,res);
            }else if(leftCount>rightCount){
                check(s,index+1,leftCount,rightCount+1,leftRem,rightRem,res);
            }
            res.deleteCharAt(len);
        }
    }
}
