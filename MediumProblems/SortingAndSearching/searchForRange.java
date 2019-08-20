class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] answer=new int[2];
        return find(nums,0,nums.length-1,target,answer);
    }
    
    public int[] find(int[] nums, int left,int right,int target,int[] answer){
        
        if(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                int back=mid;
                int front=mid;
                while(nums[back]==target){
                    back--;
                    if(back<0){
                        break;
                    }
                  // System.out.println(back+"ghat gya");
                }
                
                while(nums[front]==target){
                    front++;
                    if(front>nums.length-1){
                        break;
                    }
                }
                answer[0]=back+1;
                answer[1]=front-1;
                return answer;
            }
            else if(nums[mid]<target){
                return find(nums,mid+1,right,target,answer);
            }else{
                return find(nums,left,mid-1,target,answer);
            }
        }else{
            answer[0]=answer[1]=-1;
            return answer;
        }
       // return answer;
    }
}
