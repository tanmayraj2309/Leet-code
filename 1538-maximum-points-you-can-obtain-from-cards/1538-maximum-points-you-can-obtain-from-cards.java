class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0;
        int maxi=0;
        int rsum=0;
        for(int i=0;i<k;i++){
            lsum=cardPoints[i]+lsum;
        }
        maxi=Math.max(maxi,lsum);
        int rightindx=cardPoints.length-1;

        for(int i=k-1;i>=0;i--){
            lsum=lsum-cardPoints[i];
            rsum=cardPoints[rightindx]+rsum;
            rightindx-=1;
            maxi=Math.max(maxi,lsum+rsum);
        }
        return maxi;
        
    }
}