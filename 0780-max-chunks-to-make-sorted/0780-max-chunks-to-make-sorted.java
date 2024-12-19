class Solution {
    public int maxChunksToSorted(int[] arr) {
        

        int maxtillnow = Integer.MIN_VALUE;
        int count=0;
        int n=arr.length;
         for(int i=0;i<n;i++){
           maxtillnow= Math.max(maxtillnow ,arr[i]);
                if(maxtillnow ==i){
                    count++;
                }
            }
        
             return count;
        
    }
}


