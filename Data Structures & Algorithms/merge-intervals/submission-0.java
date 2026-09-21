class Solution {
    public int[][] merge(int[][] intervals) {
        int max = 0;
        int length = intervals.length;
        for(int index = 0; index < length; index++){
            max = Math.max(intervals[index][0], max);
        }
        int[] maps = new int[max + 1];
        for(int index = 0; index < length; index++){
            int start = intervals[index][0];
            int end = intervals[index][1];
            maps[start] = Math.max(end + 1, maps[start]);
        }
        int j = 0, have = -1, intervalStart = -1;
        for(int index = 0; index < maps.length; index++){
            if(maps[index] != 0){
                if(intervalStart == -1) intervalStart = index;
                have = Math.max(maps[index] - 1, have);
            }
            if(have == index){
                intervals[j++] = new int[]{intervalStart, have};
                have = -1;
                intervalStart = -1;
            }
        }
        if(intervalStart != -1) intervals[j++] = new int[]{intervalStart, have};
        if(intervals.length == j) return intervals;
        int[][] results = new int[j][];
        for(int index = 0; index < j; index++){
            results[index] = intervals[index];
        }
        return results;
    }
}
