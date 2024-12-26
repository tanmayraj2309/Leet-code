class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return calculate(nums, target, 0, 0);
    }
    int calculate(int[] nums, int target, int index, int currentSum) {
      if (index == nums.length && currentSum == target) return 1;
      if (index == nums.length) return 0;
      return calculate(nums, target, index + 1, currentSum + nums[index])
             + calculate(nums, target, index + 1, currentSum - nums[index]);
    }
}