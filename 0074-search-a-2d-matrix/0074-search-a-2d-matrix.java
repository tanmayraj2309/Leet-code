class Solution {

    public static boolean bs(int[] arr,int target){
        int n= arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        for( int i=0;i<n;i++){
            if(matrix[i][0]<=target && target<=matrix[i][m-1]){
                return bs(matrix[i],target);
            }
        }
        return false;
    }

}