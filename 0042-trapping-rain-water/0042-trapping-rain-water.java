class Solution {
    public int trap(int[] height) {

        // Time complexity = O(3*n) == O(n);
        // space complexity = O(2*n) == O(n); 
        
        // by suffix max and prefix max technique

        // 1st step :  prefix max find krege to tarck of left side ke max length ke tower ke height store krne ke liye

        int n=height.length;
        int pf[]=new int[n];
        pf[0]=height[0];
        for(int i=1;i<n;i++){
            pf[i]=Math.max(pf[i-1],height[i]);
        }

        // 2nd step :  suffix max find krege to tarck of right side ke max length ke tower ke height store krne ke liye
        int sf[]= new int[n];
        sf[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            sf[i]=Math.max(sf[i+1],height[i]);
        }
        int amount=0;
        int result=0;

        // now ab check krege ki har tower kitna water store krta hai aur usko result me add krege 
        for( int i=0;i<n;i++){

            // yha pe bound check kr rhe minimum niakal ke then usko height ke value se subtract kr rhe to get actual value of water
            amount=Math.min(pf[i],sf[i])-height[i];
            if(amount>0){
                result+=amount;
            }
        }
        return result;
    }
}