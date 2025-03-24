class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<List<Integer>> A = new ArrayList<>();
        for (int i = 0; i < meetings.length; i++) {
            if (A.isEmpty() || A.get(A.size() - 1).get(1) < meetings[i][0]) {
                A.add(Arrays.asList(meetings[i][0], meetings[i][1]));
            }
            else {
                A.get(A.size() - 1).set(1, Math.max(A.get(A.size() - 1).get(1), meetings[i][1]));
            }
        }
        int cnt = 0;
        int day = 1;
        int i = 1, j = A.get(A.size() - 1).get(1), ind = 0;
        System.out.println(A);
        while (ind < A.size()) {
            cnt +=  A.get(ind).get(0) - i;
            i = A.get(ind).get(1) + 1;
            ind += 1;
        }
        cnt += days - A.get(A.size() - 1).get(1);
        return cnt;
    }
}