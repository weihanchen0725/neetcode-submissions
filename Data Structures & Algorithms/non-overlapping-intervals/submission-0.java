class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1],b[1]));
        int results = 0, prevEnd = intervals[0][1];
        for(int index = 1; index < intervals.length;index++){
            int start = intervals[index][0];
            int end = intervals[index][1];
            if(start < prevEnd){
                results++;
            }else{
                prevEnd = end;
            }
        }
        return results;
    }
}
