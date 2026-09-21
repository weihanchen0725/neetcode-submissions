class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] counts = new int[26];
        for(char t : tasks){
            counts[t-'A']++;
        }
        PriorityQueue<Integer> pque = new PriorityQueue<>(Collections.reverseOrder());
        for(int cnt : counts){
            if(cnt > 0){
                pque.add(cnt);
            }
        }

        int time = 0;
        Queue<int[]> que = new LinkedList<>();
        while(!pque.isEmpty() || !que.isEmpty()){
            time++;
            if(pque.isEmpty()){
                time = que.peek()[1];
            }else{
                int count = pque.poll() - 1;
                if(count > 0){
                    que.add(new int[]{count, time + n});
                }
            }

            if(!que.isEmpty() && que.peek()[1] == time){
                pque.add(que.poll()[0]);
            }
        }
        return time;
    }
}
