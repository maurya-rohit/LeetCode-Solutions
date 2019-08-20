class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> answer =new ArrayList<>();
        Map<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<nums.length;i++){
                count.put(nums[i],count.getOrDefault(nums[i],0)+1);
            
        }
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        
        for(Map.Entry<Integer,Integer> each:count.entrySet()){
           maxHeap.add(each);
        }
        while(k>0){
            answer.add(maxHeap.poll().getKey());
            k--;
        }
        return answer;
    }
}
