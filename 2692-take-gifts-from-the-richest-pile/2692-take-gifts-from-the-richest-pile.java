class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int gift:gifts) pq.add(gift);

        for(int i=0;i<k;i++){
            pq.add((int)Math.floor(Math.sqrt(pq.remove())));
        }

        long sum=0;
        
         while(!pq.isEmpty()){
            sum+=pq.remove();
         }

         return sum;
    }
}