/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> answer=new ArrayList<>();
        if(intervals.size()<2) return intervals;
        Collections.sort(intervals,((a,b)->a.start-b.start));
       int start=intervals.get(0).start;
        int end=intervals.get(0).end;
        answer.add(new Interval(start,end));
        for(int i=1;i<intervals.size();i++){
            if((intervals.get(i).end>=end && intervals.get(i).start<=end)||(intervals.get(i).start>=start && intervals.get(i).end<=end)){
                answer.remove(answer.size()-1);
                start=Math.min(start,intervals.get(i).start);
                end=Math.max(end,intervals.get(i).end);
                answer.add(new Interval(start,end));
            }else{
                start=intervals.get(i).start;
                end=intervals.get(i).end;
                answer.add(new Interval(start,end));
            }
        }
        return answer;
    }
}
