class Solution {
    public void rotate(int[] nums, int k) {

        int n= nums.length;

        // this k is calculate like this because agr pura 
        //array length ke equal roatate array krege toh same aayega isliye jo rem hoga utna hi rotate krege
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);


        for(int i=0;i<n;i++){
            System.out.print(nums[i]+",");
        }
        
    }
    public static void reverse(int[] arr,int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}