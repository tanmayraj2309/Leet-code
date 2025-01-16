class Solution {
    public int findMaxLength(int[] arr) {
        int n= arr.length;
        if(n==1){
            return 0;
        }
        // first we all o convert into -1
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }

        int prefixsum=0;
        int maxlen=0;
        
        // hashmap to map unique prefix sum 
        HashMap<Integer,Integer> prefixmap= new HashMap<>();
        // when arr first element index0 edge case
        prefixmap.put(0,-1);  // after length become(-1+1=0)

        for( int i=0;i<n;i++){
            prefixsum+=arr[i];
            if(prefixmap.containsKey(prefixsum)){
                maxlen=Math.max(maxlen,i- prefixmap.get(prefixsum));
            }
            else {
                prefixmap.put(prefixsum,i);
            }
        }
        return maxlen;
        
    }
}