class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);
        for(int num: nums) pq.add(num);
        long sum=0;
        for(int i=0;i<k;i++){
            int max=pq.remove();
            sum+=max;
            pq.add((int)Math.ceil(max/3.0));

        }
        return sum;


        
    }
}