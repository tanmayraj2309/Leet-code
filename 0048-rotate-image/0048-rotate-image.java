class Solution {
    public void rotate(int[][] matrix) {

        // transpose // j sirf i tk isliye kyon ki half part niche wla ko hi swap kr rhe
        for(int i=1;i<matrix[0].length;i++){
            for(int j=0;j<i;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                
            }
        }


        // Reverse the array Row WWWise
        
        
        for(int i=0;i<matrix[0].length;i++){
            int s=0;
            int e=matrix[0].length-1;
            while(s<e){
                int temp=matrix[i][s];
                matrix[i][s]=matrix[i][e];
                matrix[i][e]=temp;
                e--;
                s++;

            }
        }
       
        
    }
}