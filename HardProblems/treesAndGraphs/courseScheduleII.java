class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
     int[] answer=new int[numCourses];
        int index=-1;
        Queue<Integer> q=new LinkedList<>();
        int[] indegree=new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            indegree[prerequisites[i][0]]++;
                }
        
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
                 index++;
                answer[index]=i;
              }
        }
        while(!q.isEmpty()){
            int pre=q.poll();
            for(int i=0;i<prerequisites.length;i++){
                if(pre==prerequisites[i][1]){
                    indegree[prerequisites[i][0]]--;    
                    if(indegree[prerequisites[i][0]]==0){
                        q.add(prerequisites[i][0]);
                        index++;
                    //     System.out.println(index);
                        answer[index]=prerequisites[i][0];
                        
                    }
                }
            }
        }
        //System.out.println(index);
        return index+1==numCourses ?answer : new int[0];
    }
}
