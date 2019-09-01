class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> numbers=new HashSet<>();
        int answer=1;
        for(int i=0;i<nums.length;i++){
            numbers.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            int ans=1;
           if(!numbers.contains(nums[i]-1)){
               int k=nums[i];
               while(numbers.contains(k+1)){
                   k++;
                   ans++;
               }
           }
            if(ans>answer)
                answer=ans;
        }
        return answer;
        
            }
        }
    
