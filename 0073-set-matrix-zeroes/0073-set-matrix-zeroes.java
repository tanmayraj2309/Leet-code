class Solution {
    public void setZeroes(int[][] matrix) {
        // time complexity = o(m*n)
        // space complexity= o(m+n)
        int n=matrix.length;
        int m = matrix[0].length;
        // making hashset for uniquely storing where matrix has value 0
        HashSet<Integer> row= new HashSet<>();
        HashSet<Integer> col= new HashSet<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(matrix[i][j]==0){
                row.add(i);
                col.add(j);
               }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row.contains(i) || col.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }
}