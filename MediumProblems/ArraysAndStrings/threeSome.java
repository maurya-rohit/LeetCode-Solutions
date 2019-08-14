class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> answer=new ArrayList<>();
        if(nums.length<2) return answer;
        Arrays.sort(nums);
       
         Map<Integer,Integer> check=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            check.put(nums[i],i);
        }
        for(int i=0;i<nums.length-2;i++){
      if(i!=0 && nums[i]==nums[i-1]) {
          continue; }
            for(int j=i+1;j<nums.length-1;j++){
               
            int sum=0-nums[i]-nums[j];
            if(check.containsKey(sum) && check.get(sum)>j){
                answer.add(Arrays.asList(nums[i],nums[j],sum));
                j=check.get(nums[j]);
                }
            }
            }
         return answer;
        }
       
    }
