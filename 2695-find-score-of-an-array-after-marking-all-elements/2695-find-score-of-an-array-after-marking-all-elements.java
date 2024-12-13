import java.util.PriorityQueue;

class Solution { 
    public long findScore(int[] nums) {
        int n = nums.length;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        for (int i = 0; i < n; i++) {
            pq.add(new int[]{nums[i], i});  // Store both value and index
        }

        long sum = 0;
        boolean[] marked = new boolean[n]; // Track marked indices

        while (!pq.isEmpty()) {
            int[] top = pq.remove();
            int val = top[0];
            int index = top[1];

            // If already marked, skip
            if (marked[index]) continue;

            // Add the value to the score
            sum += val;

            // Mark the current index and its adjacent elements
            marked[index] = true;
            if (index - 1 >= 0) marked[index - 1] = true;
            if (index + 1 < n) marked[index + 1] = true;
        }

        return sum;
    }
}
