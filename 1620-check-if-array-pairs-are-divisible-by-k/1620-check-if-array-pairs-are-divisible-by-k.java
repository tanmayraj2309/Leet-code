class Solution {
    public boolean canArrange(int[] arr, int k) {
        
        int n=arr.length;
        if(n%2!=0){
            return false;
        }
        int r[]= new int[k];
        for(int val:arr){
            int rem=(val%k+k)%k;
            r[rem]++;
        }
          if(r[0]%2!=0){
                return false;
            }
        for(int i=1;i<=k/2;i++){
            if(r[i]!=r[k-i]){
                return false;
            }
          
        }
        return true;

    }
}