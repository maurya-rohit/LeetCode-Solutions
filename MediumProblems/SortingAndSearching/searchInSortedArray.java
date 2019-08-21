class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
    if(nums.length<1) return -1;
        if(nums[left]<=nums[right]){
            return search(nums,left,right,target);
        }
        int index=find(nums,0,nums.length-1);
        System.out.println(index);
        if(target==nums[index])
            return index;
        else if(target<=nums[right])
            return search(nums,index+1,nums.length-1,target);
        else
        return search(nums,0,index-1,target);
    }
    
    public int find(int[] nums,int left,int right){
        while(left<=right){
            int mid=(left+right)/2;
            if(mid==left)
                return left;
            if(mid==right)
                return right;
            if(nums[mid]<nums[mid-1] && nums[mid]<nums[mid+1]){
                return mid;
            }else if(nums[left]<nums[mid]){
                left=mid;
            }else{
                right=mid;
            }
        }
        return left;
    }
    public int search(int[] nums,int left,int right,int target)
    {
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}
