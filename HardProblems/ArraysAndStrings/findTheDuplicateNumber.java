class Solution {
    public int findDuplicate(int[] nums) {
    int ptr1=nums[0];
        int ptr2=nums[0];
        do{
            ptr1=nums[ptr1];
            ptr2=nums[nums[ptr2]];
        }while(ptr1!=ptr2);
        
        int tor=ptr1;
        int index=nums[0];
        while(tor!=index){
           index=nums[index];
             tor=nums[tor];
        }
        return index;
    }
}
