class Solution {
    
    class NumberIndex{
        public int index;
        public int number;
        NumberIndex(int number,int index){
            this.index=index;
            this.number=number;
        }
        NumberIndex(NumberIndex ix){
            this.number=ix.number;
            this.index=ix.index;
        }
    }
    public List<Integer> countSmaller(int[] nums) {
        NumberIndex[] cnums=new NumberIndex[nums.length];
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            cnums[i]=new NumberIndex(nums[i],i);
        }
        cnums=sort(cnums,res);
        return Arrays.stream(res).boxed().collect(Collectors.toList());
    }
    
    public NumberIndex[] sort(NumberIndex[] cnums,int[] res){
        int half=cnums.length/2;
        if(half>0){
            NumberIndex[] rightPart=new NumberIndex[cnums.length-half];
            NumberIndex[] leftPart=new NumberIndex[half];
            for(int i=0;i<leftPart.length;i++){
                leftPart[i]=new NumberIndex(cnums[i]);
            }
            for(int i=0;i<rightPart.length;i++){
                rightPart[i]=new NumberIndex(cnums[half+i]);
            }
            NumberIndex[] left=sort(leftPart,res);
            NumberIndex[] right=sort(rightPart,res);
            int m=left.length;
            int n=right.length;
            int i=0;
            int j=0;
            while(i<m || j<n) {
                if(j==n || i<m && left[i].number<=right[j].number){
                    cnums[i+j]=left[i];
                    res[left[i].index]+=j;
                    i++;
                }else{
                    cnums[i+j]=right[j];
                    j++;
                }
            }
        }
        return cnums;
    } 
}
