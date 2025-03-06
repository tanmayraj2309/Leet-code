class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        boolean arr[] = new boolean[n*n];
        int repeat=0;
        for(int i=0;i<grid.length;i++){
            for(int j : grid[i]){
                if(arr[j-1])
                    repeat = j;
                else
                    arr[j-1] = true;
            }
        }
        int missing = 0;
        for(int i=0;i<arr.length;i++){
            if(!arr[i])
            {
                missing = i+1;
                break;
            }
        }
        return new int[]{repeat, missing};
    }
}