class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        if (k == 0) return 1;
        int sum = 0;
        int rs = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum |= nums[i];
            if (sum >= k) {
                int sum2 = 0;
                int j = i;
                while (sum2 < k) {
                    sum2 |= nums[j--];
                }
                rs = Math.min(rs, i - j);
                sum = 0;
                i = j + 2;
            }
        }

        if (rs == Integer.MAX_VALUE) {
            return -1;
        } else {
            return rs;
        }
    }
}