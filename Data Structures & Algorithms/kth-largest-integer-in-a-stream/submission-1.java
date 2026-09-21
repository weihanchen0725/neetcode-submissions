class KthLargest {

    private PriorityQueue<Integer> pque;
    private int target;

    public KthLargest(int k, int[] nums) {
        this.target = k;
        this.pque = new PriorityQueue<>();
        for(int num : nums){
            pque.offer(num);
            if(pque.size() > target){
                pque.poll();
            }
        }
    }
    
    public int add(int val) {
        pque.offer(val);
        if(pque.size() > target){
            pque.poll();
        }
        return pque.peek();
    }
}
