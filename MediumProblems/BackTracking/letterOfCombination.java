class Solution {
     private static Map<Character,String> datas= new HashMap<>();
        
    public List<String> letterCombinations(String digits) {
       datas.put('2',"abc");
        datas.put('3',"def");
        datas.put('4',"ghi");
        datas.put('5',"jkl");
        datas.put('6',"mno");
        datas.put('7',"pqrs");
        datas.put('8',"tuv");
        datas.put('9',"wxyz");
        List<String> answer=new ArrayList<>();
        if(digits.length()<1) return answer;
        return makeString("",digits,answer,0);
    }
    public List<String> makeString(String current,String digits,List<String> answer,int pos){
        if(pos>=digits.length()){
            answer.add(current);
            return answer;
        }
        else{
            String chars=datas.get(digits.charAt(pos));
            for(int i=0;i<chars.length();i++){
                makeString(current+chars.charAt(i),digits,answer,pos+1);
            }
        }
        return answer;
    }
}
