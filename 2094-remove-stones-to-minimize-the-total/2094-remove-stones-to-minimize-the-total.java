class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->b-a);
        for(int pile:piles) pq.add(pile);
        for(int i=0;i<k;i++){
            // max removal to find minimum
            int maxremv=pq.remove();
            pq.add((int)Math.floor(maxremv-maxremv/2));
        }
        
        int sum=0;
        while(!pq.isEmpty()){
            sum=sum+pq.remove();
        }
        return sum;
    }
}