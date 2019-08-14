class Solution {
private int[] array;
    private int[] original;
    
    Random r=new Random();
     private int randRange(int min, int max) {
        return r.nextInt(max - min) + min;
    }
    public Solution(int[] nums) {
        array=nums;
        original=nums.clone();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        array=original;
        original=original.clone();
        return original;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for(int i=0;i<array.length;i++){
            int j=randRange(i,array.length);
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }
        return array;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
