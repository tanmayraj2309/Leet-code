class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());
        double sum=0.0;
        for(double num:nums) {
            pq.add(num);
            sum+=num;
        }
        double halfsum=sum/2;
        double newsum=0.0;
        int count=0;
        while(sum>halfsum){

            double halfhighestnum=pq.remove()/2;
            pq.add(halfhighestnum);
            sum-=halfhighestnum;
            count++;
        }
        return count;




        
    }
}