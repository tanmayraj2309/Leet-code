class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b)->a[a.length-1]-b[b.length-1]);
        int end=intervals[0][1];
        int count=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<end){
                count++;
            }
            else{
                end=intervals[i][1];
            }
        }
        return count;
        
    }
}