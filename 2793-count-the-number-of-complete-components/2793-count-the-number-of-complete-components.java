class Solution {
    int[] parent;
    int[] rank;
    public int countCompleteComponents(int n, int[][] edges) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
        for (int[] edge : edges) {
            union(edge[0], edge[1]);
        }
        int[] compSize = new int[n];
        long[] compEdges = new long[n];
        for (int i = 0; i < n; i++) {
            compSize[find(i)]++;
        }
        for (int[] edge : edges) {
            compEdges[find(edge[0])]++;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (find(i) == i) {
                if (compEdges[i] == (long) compSize[i] * (compSize[i] - 1) / 2) {
                    count++;
                }
            }
        }
        return count;
    }
    
    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    
    private void union(int x, int y) {
        int rx = find(x);
        int ry = find(y);
        if (rx == ry) return;
        if (rank[rx] < rank[ry]) {
            parent[rx] = ry;
        } else if (rank[rx] > rank[ry]) {
            parent[ry] = rx;
        } else {
            parent[ry] = rx;
            rank[rx]++;
        }
    }
}