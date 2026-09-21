class KthLargest {
    List<Integer> list;
    int target;

    public KthLargest(int k, int[] nums) {
        target = k;
        list = new ArrayList<>();
        for(int index = 0; index < nums.length; index++){
            list.add(nums[index]);
        }
    }
    
    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        return list.get(list.size()-target);
    }
}
