class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap= new PriorityQueue<>();
        for(int i=0;i<k;i++){
            minheap.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(minheap.peek()<nums[i]){
                minheap.remove();
                minheap.add(nums[i]);
            }
        }
        return minheap.peek();

        
    }
}