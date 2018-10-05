class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int[] answer=new int[m+n];
        int l1=0;
        int l2=0;
        int pos=0;
        while(l1<m && l2<n){
            if(nums1[l1]<nums2[l2]){
                answer[pos]=nums1[l1];
                l1++;
                pos++;
            }else{
                answer[pos]=nums2[l2];
                l2++;
                pos++;
            }
        }
        if(l1<m){
            while(l1<m){
                answer[pos]=nums1[l1];
                l1++;
                pos++;
            }
        }
        if(l2<n){
            while(l2<n){
                answer[pos]=nums2[l2];
                l2++;
                pos++;
            }
        }
        
        for(int j=0;j<answer.length;j++){
            nums1[j]=answer[j];
        }
        return;
    }
}
