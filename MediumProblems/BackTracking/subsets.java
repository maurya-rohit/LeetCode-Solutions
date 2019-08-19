class Solution {
public List<List<Integer>> subsets(int[] nums) {

    List<List<Integer>> answer=new ArrayList<>();
    
    backtrack(nums,answer,0,new ArrayList<>());
    return answer;

}
    
    public void backtrack(int[] nums,List<List<Integer>> answer,int index,List<Integer> temp){
        answer.add(new ArrayList<>(temp));
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(nums,answer,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}
