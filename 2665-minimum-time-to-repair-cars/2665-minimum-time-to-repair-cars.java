class Solution {
    public boolean check(int[] ranks, long mid, long cars) {
        long count = 0;
        for (int rank : ranks) {
            count += (long) Math.sqrt(mid / rank);
            if (count >= cars) return true; 
        }
        return count >= cars;
    }

    public long repairCars(int[] ranks, int cars) {
        long low = 1, high = (long) 1e14;

        while (low < high) {
            long mid = low + (high - low) / 2;
            if (check(ranks, mid, cars)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}