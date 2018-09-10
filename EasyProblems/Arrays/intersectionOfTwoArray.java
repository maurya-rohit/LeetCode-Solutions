class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> ints= new HashMap<>();
        List<Integer> list=new ArrayList<>();
        if(nums1.length==0){
            return nums1;
        }else if(nums2.length==0){
            return nums2;
        }
        for(int i=0; i<nums1.length;i++){
            if(ints.containsKey(nums1[i])){
                ints.put(nums1[i],ints.get(nums1[i])+1);
                System.out.println("Added Upper"+nums1[i]);
            }else{
           ints.put(nums1[i],1);
            System.out.println("Added Lower"+nums1[i]);}
        }
        for(int i=0;i<nums2.length;i++){
            if(ints.containsKey(nums2[i])){
                 System.out.println("Contains "+nums2[i]);
                if(ints.get(nums2[i])>1){
                    ints.put(nums2[i],ints.get(nums2[i])-1);
                     System.out.println("Deleted Upper "+ints.get(nums2[i]));
                }else{
                    ints.remove(nums2[i]);
             System.out.println("Deleted Lower "+ints.get(nums2[i]));
                }
               list.add(nums2[i]); 
                System.out.println(nums2[i]);
            }
            }
        int j=0;
       int[] result=new int[list.size()];
             while(j<list.size()) {
                result[j]=list.get(j);
                 j++;
             }
            return result;
}
        
    }
