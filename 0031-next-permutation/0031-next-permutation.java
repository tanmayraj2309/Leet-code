class Solution {
    public void nextPermutation(int[] arr) {
        int n=arr.length;
        int indx=-1;

        // index find kr rhe hai kha pe break hoga 
        for(int i =n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                indx=i;
                break;
            }
        }
        // edge case jb koi next permutation na ho toh 
        if(indx==-1){
            reverse(arr,0);
            return;
        }

     else {
             // now ab jo rest baad ka array element me se woh element dhundege jo ki smallest greater ho arr[indx] se
              for(int i=n-1;i>indx;i--){
                  if(arr[indx]<arr[i]){
                    swap(arr,indx,i);
                     break;
                 }
             }
                   reverse(arr,indx+1);

          }
       
        
    }


    // 
     void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

     void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}