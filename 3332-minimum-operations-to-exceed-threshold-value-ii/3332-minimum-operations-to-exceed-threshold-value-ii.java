class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int num : nums){
            pq.add((long)num);
        }
        int count = 0;

        while(pq.peek() < k){
            long first = pq.remove();
            long second = pq.remove();

            long fin = Math.min(first, second) *2 + Math.max(first, second);
            pq.add(fin);
            count++;
        }
        return (int)count;
    }
}