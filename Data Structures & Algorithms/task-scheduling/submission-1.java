class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] counts = new int[26];
        for(char t : tasks){
            counts[t - 'A']++;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int c : counts){
            if(c > 0){
                maxHeap.add(c);
            }
        }
        int time = 0;
        Queue<int[]> que = new LinkedList<>();
        while(!maxHeap.isEmpty() || !que.isEmpty()){
            time++;
            if(maxHeap.isEmpty()){
                time = que.peek()[1];
            }else{
                int count = maxHeap.poll()-1;
                if(count > 0){
                    que.add(new int[]{count, time + n});
                }
            }
            if(!que.isEmpty() && que.peek()[1] == time){
                maxHeap.add(que.poll()[0]);
            }
        }
        return time;
    }
}
