class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res= new int[n][n];
        int count=1;
        int r=0;
        int rend=n-1;
        int c=0;
        int cend=n-1;
        while(r<=rend && c<=cend){
            for(int i=c;i<=cend;i++){
                res[r][i]=count;
                count++;
            }
            r++;

            for(int i=r;i<=rend;i++){
                res[i][cend]=count;
                count++;
            }
            cend--;
            for(int i=cend;i>=c;i--){
                res[rend][i]=count;
                count++;
            }
            rend--;
            for(int i=rend;i>=r;i--){
                res[i][c]=count;
                count++;
            }
            c++;
        }
        return res;

        






       
        
    }
}