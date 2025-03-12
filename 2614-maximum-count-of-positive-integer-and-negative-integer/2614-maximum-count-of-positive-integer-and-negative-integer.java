
class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        int firstPositive = findFirstPositive(nums);
        int lastNegative = findLastNegative(nums);
        
        int posCount = n - firstPositive;
        int negCount = lastNegative + 1;

        return Math.max(posCount, negCount);
    }
    private int findFirstPositive(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    
    private int findLastNegative(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
