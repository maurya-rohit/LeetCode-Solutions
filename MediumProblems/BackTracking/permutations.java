import java.util.*;
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer=new ArrayList<>();
      //  List<Integer> each=new ArrayList<>();
        return makePermute(nums,0,answer);
        
    }


public List<List<Integer>> makePermute(int[] nums,int index,List<List<Integer>> answer){
    if(index==nums.length-1){
       
        List<Integer> each=new ArrayList<>();
        for(int i:nums){
            each.add(i);
        }
        answer.add(each);
        return answer;
    }else{
        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);
            makePermute(nums,index+1,answer);
            swap(nums,index,i);
        }
    }
    return answer;
}
public void swap(int[] nums,int index,int i){
    int temp=nums[index];
    nums[index]=nums[i];
    nums[i]=temp;
}
}
