class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a,b) -> a[0]-b[0]);

        for (int i = 1; i < items.length; i++) {
            items[i][1] = Math.max(items[i][1], items[i - 1][1]);
        }

        for (int i = 0; i < queries.length; i++) {
            int queryPrice = queries[i];
            int low = 0, high = items.length - 1;
            int maxBeauty = 0;

           
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (items[mid][0] <= queryPrice) {
                    maxBeauty = items[mid][1];
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            
            queries[i] = maxBeauty;
        }
        return queries;
    }
}