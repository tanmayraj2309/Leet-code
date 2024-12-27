class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int i=0;
        int max1=values[0]; // store max values of = value[i]+i;
        int max2=0;   // store max values of = max1+values[j]-j;
        for(int j=1;j<values.length;j++){
            max1=Math.max(max1,values[j-1]+j-1);
            max2=Math.max(max2,max1+values[j]-j);

        }
        return max2;
    }
}