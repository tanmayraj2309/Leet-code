class Solution {
    public static long minEnd(final int n, final int x) {
        return x | Long.expand(n - 1, ~(long)x);
    }
}