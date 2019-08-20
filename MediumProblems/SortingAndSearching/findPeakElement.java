class Solution {
    public int findPeakElement(int[] nums) {
        int left=0;
        int right=nums.length-1;
        return find(nums,left,right);
    }
    public int find(int[] nums,int left,int right){
        if(left==right)
            return left;
        else{
            int mid=(left+right)/2;
            if(nums[mid]>nums[mid+1]){
                return find(nums,left,mid);
            }else{
                return find(nums,mid+1,right);
            }
        }
          
        }
    }
