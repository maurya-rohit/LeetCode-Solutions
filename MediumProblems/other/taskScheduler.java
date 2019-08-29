class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] ch=new int[26];
        for(int i=0;i<tasks.length;i++){
            ch[tasks[i]-'A']++;
        }
        Arrays.sort(ch);
        int i=25;
        while(i>0 && ch[i]==ch[25])i--;
        
        return Math.max(tasks.length,(ch[25]-1)*(n+1)+25-i);
    }
}
