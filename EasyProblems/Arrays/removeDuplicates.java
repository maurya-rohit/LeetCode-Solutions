class Solution {
    public int removeDuplicates(int[] nums) {
        int length=1;
        if(nums.length<=1){
            return length;
        }else if(nums.length==2){
            if(nums[0]==nums[1])
                return length;
            else
                return length+1;
        }
        else {
            int pos=0;
           for(int i=0;i<nums.length-1;i++){
             if(nums[i]!=nums[i+1]){
                   nums[pos+1]=nums[i+1];
                 pos++;
               }
           }
            return pos+1;
        }
    }
}
