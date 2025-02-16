class Solution {
    public int[] constructDistancedSequence(int n) {
        int size = (((n-2)+1)*2)+1;
        int[] pos = new int[n];
        int[] ans = new int[size];
        rec(ans, n, 0, pos);
        return ans;
        
    }

   public boolean rec(int[] ans, int n, int idx,int[]pos ){
     if(idx>ans.length-1){
            // System.out.println(Arrays.toString(ans));
            return true;

        }
        if(ans[idx]!=0){
            return rec(ans, n, idx+1, pos);
        }

        for(int i = n; i>=1; i--){
            if(pos[i-1]==-1 ){
                continue;
            }
            if(i!=1){
              int z = idx+i;
              if(z>ans.length-1){
                return false;
              }
              if(ans[z]!=0){
                continue;
                }
            }
              

            ans[idx] = i;
            pos[i-1] = -1;
            
            if(i!=1)
                ans[idx+i] = i;
            
             if(rec(ans, n, idx+1, pos)){
                return true;
             }
            
            pos[i-1] = 0;
            ans[idx] = 0;
            
            if(i!=1)
                ans[idx+i] = 0;
           
        }

        return false ;



    }


    
}