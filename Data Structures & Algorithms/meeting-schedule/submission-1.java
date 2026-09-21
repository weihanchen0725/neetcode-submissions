/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, Comparator.comparingInt(i -> i.start));
        for(int index = 1; index < intervals.size(); index++){
            Interval i1 = intervals.get(index - 1);
            Interval i2 = intervals.get(index);
            if(i1.end > i2.start){
                return false;
            }
        }
        return true;
    }
}
