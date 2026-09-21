class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length == 0) return new int[][] {newInterval};
        
        int length = intervals.length;
        int left = 0, right = length - 1;
        int target = newInterval[0];

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(intervals[mid][0] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        List<int[]> results = new ArrayList<>();
        for(int index = 0; index < left; index++){
            results.add(intervals[index]);
        }
        results.add(newInterval);
        for(int index = left; index < length; index++){
            results.add(intervals[index]);
        }
        
        List<int[]> mergedList = new ArrayList<>();
        for(int[] interval : results){
            if(mergedList.isEmpty() || mergedList.get(mergedList.size()-1)[1] < interval[0]){
                mergedList.add(interval);
            } else {
                mergedList.get(mergedList.size()-1)[1] = Math.max(mergedList.get(mergedList.size()-1)[1], interval[1]);
            }
        }
        return mergedList.toArray(new int[0][]);
    }
}
