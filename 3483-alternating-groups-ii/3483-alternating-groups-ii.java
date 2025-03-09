class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        // brute force ye hai ki ek jgh store sare array n+k tk sliiding windoe
        int left=0;
        int res=0;
        int n= colors.length;
        for(int right=1;right<(n+k-1);right++){
            // skip subbarray
               if(colors[right%n] ==colors[(right-1)%n]){
                left=right;
               }
               if(right-left+1==k){
                res++;
                left++;
               }

        }
        return res;
        
    }
}