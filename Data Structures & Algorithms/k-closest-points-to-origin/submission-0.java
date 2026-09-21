class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pque = new PriorityQueue<>(Comparator.comparing(a -> a[0]));
        for(int[] point : points){
            int dist = point[0] * point[0] + point[1] * point[1];
            pque.offer(new int[]{dist, point[0], point[1]});
        }
        int[][] result = new int[k][2];
        for(int index = 0; index < k; index++){
            int[] point = pque.poll();
            result[index] = new int[]{point[1], point[2]};
        }
        return result;
    }
}
