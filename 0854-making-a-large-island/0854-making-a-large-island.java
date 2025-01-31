class Solution {
    // marks the island containing this (y,x) with islandIdx and returns size
    private int markIslands(int y, int x, int islandIdx, int[][] grid, int[][] markedIslands) {
        int n = grid.length;
        if (y < 0 || y >= n || x < 0 || x >= n || grid[y][x] == 0 || markedIslands[y][x] != 0 ) return 0;

        markedIslands[y][x] = islandIdx;

        return 1 + markIslands(y - 1, x, islandIdx, grid, markedIslands) + markIslands(y + 1, x, islandIdx, grid, markedIslands) + markIslands(y, x - 1, islandIdx, grid, markedIslands) + markIslands(y, x + 1, islandIdx, grid, markedIslands);

    }

    public int largestIsland(int[][] grid) {
        int n = grid.length;

        // mark all islands and store their sizes
        int[][] markedIslands = new int[n][n];
        Map<Integer, Integer> sizeMap = new HashMap();
        int maxIslandSize = 0;
        int islandIdx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && markedIslands[i][j] == 0) {
                    islandIdx++;

                    // store the size of the marked island
                    int islandSize = markIslands(i, j, islandIdx, grid, markedIslands);
                    sizeMap.put(islandIdx, islandSize);

                    // store the max island size encountered
                    maxIslandSize = Math.max(maxIslandSize, islandSize);
                }
            }
        }

        // now find the max island size possible by combining two or more islands
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // islands can only be combined if a 0 is encountered surrounded by multiple islands
                if (grid[i][j] != 0) continue;

                // we can fetch all different islands in all 4 directions;
                Set<Integer> set = new HashSet();
                if (i > 0 && markedIslands[i - 1][j] != 0) set.add(markedIslands[i - 1][j]);
                if (i < n - 1 && markedIslands[i + 1][j] != 0) set.add(markedIslands[i + 1][j]);
                if (j > 0 && markedIslands[i][j - 1] != 0) set.add(markedIslands[i][j - 1]);
                if (j < n - 1 && markedIslands[i][j + 1] != 0) set.add(markedIslands[i][j + 1]);

                int sumOfIslandsSizes = 1;
                for (Integer island : set) {
                    sumOfIslandsSizes += sizeMap.get(island);
                }

                maxIslandSize = Math.max(maxIslandSize, sumOfIslandsSizes);
            }
        }

        return maxIslandSize;
    }
}