class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pque = new PriorityQueue<>();
        for(int stone : stones){
            pque.offer(-stone);
        }
        while(pque.size()>1){
            int first = pque.poll();
            int second = pque.poll();
            if(second > first){
                pque.offer(first - second);
            }
        }
        pque.offer(0);
        return Math.abs(pque.peek());
    }
}
