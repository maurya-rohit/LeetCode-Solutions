class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> answer=new ArrayList<>(); 
        Map<String,List<String>> maps=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String key=String.valueOf(arr);
            if(!maps.containsKey(key)){
                maps.put(key,new ArrayList<String>());
            }
            maps.get(key).add(strs[i]);
        }
        return new ArrayList<List<String>>(maps.values());
        
    }
}
