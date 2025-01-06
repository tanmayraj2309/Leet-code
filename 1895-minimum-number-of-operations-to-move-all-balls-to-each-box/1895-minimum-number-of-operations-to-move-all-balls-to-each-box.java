class Solution {
    public int[] minOperations(String boxes) {
          int n = boxes.length();
        int[] answer = new int[n];
        
        // Left to right traversal
        int balls = 0; // Count of balls on the left
        int ops = 0;   // Total operations to bring balls to current box
        for (int i = 0; i < n; i++) {
            answer[i] += ops;
            balls += boxes.charAt(i) - '0'; // Add current box's ball count
            ops += balls; // Update total operations
        }
        
        // Right to left traversal
        balls = 0; // Reset count for balls on the right
        ops = 0;   // Reset operations
        for (int i = n - 1; i >= 0; i--) {
            answer[i] += ops;
            balls += boxes.charAt(i) - '0'; // Add current box's ball count
            ops += balls; // Update total operations
        }
        
        return answer;
        
    }
}