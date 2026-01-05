class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int minpos=Integer.MAX_VALUE;
        int maxneg=Integer.MIN_VALUE;
        int negcount=0;
        long sum=0;
        long negsum=0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<0){
                    negcount+=1;
                    negsum-=(matrix[i][j]);
                    maxneg=Math.max(maxneg, matrix[i][j]);
                }
                else{
                    sum+=matrix[i][j];
                    minpos=Math.min(minpos,matrix[i][j]);
                }
            }
        }
        if(negcount%2==0){
            return sum+negsum;
        }
        return sum+negsum - 2*Math.min(-maxneg,minpos);
        
    }
}