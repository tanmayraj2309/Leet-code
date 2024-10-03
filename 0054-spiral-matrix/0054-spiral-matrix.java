class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list= new ArrayList<Integer>();
        int n= matrix.length;
        int m=matrix[0].length;
        int r_step=n-1;
        int c_step=m-1;
        int i=0;
        int j=0;
        //  if (matrix.length == 0) {
        //     return list;
        // }

        while(r_step>=1 && c_step>=1){

            for (int k = 0; k < c_step; k++) {
                list.add(matrix[i][j]); 
                j++;
            }
            for(int k=0;k<r_step;k++){
                list.add(matrix[i][j]);
                i++;
            }
             for(int k=0;k<c_step;k++){
                list.add(matrix[i][j]);
                j--;
            }
              for(int k=0;k<r_step;k++){
                list.add(matrix[i][j]);
                i--;
            }
            i++;
            j++;
            r_step=r_step-2;
            c_step=c_step-2;
            

        }
        if(r_step==0){
            for(int k=0;k<c_step+1;k++){
                list.add(matrix[i][j]);
                j++;
            }

        }
        else if(c_step==0){
             for(int k=0;k<r_step+1;k++){
                list.add(matrix[i][j]);
                i++;            }


        }
        return list;

        
    }
}