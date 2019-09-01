class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
      if(nums.length==0) return new int[0];
        int[] answer=new int[nums.length-k+1];
        Deque<Integer> dq=new LinkedList<>();
        int i;
        for(i=0;i<k;i++){
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]){
                dq.removeLast();
            }
            dq.add(i);
        }
        int insert=0;
        for(;i<nums.length;i++){
            answer[insert]=nums[dq.peek()];
            insert++;
            while(!dq.isEmpty() && dq.peek()<=i-k){
                dq.remove();
            }
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]){
                  dq.removeLast();
            }
            dq.add(i);
        }
        answer[insert]=nums[dq.peek()];
        return answer;
    }
}
