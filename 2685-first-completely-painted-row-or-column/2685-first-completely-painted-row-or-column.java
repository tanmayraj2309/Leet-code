class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int n= mat.length;
        int m=mat[0].length;
        int rowcount[]=new int[n];
        int colcount[]= new int[m];

        HashMap<Integer,int[]> map=new HashMap<>();
        for(int i=0;i<n;i++){
             for( int j=0;j<m;j++){
                map.put(mat[i][j], new int[]{i,j});
             }
        }

        int totalcell=n*m;

        for( int i=0;i<totalcell;i++){
            int cell[]=map.get(arr[i]);
            rowcount[cell[0]]++;
            colcount[cell[1]]++;
            if(rowcount[cell[0]]==m || colcount[cell[1]]==n){
                return i;
            }
        }
        return -1;

        
    }
}