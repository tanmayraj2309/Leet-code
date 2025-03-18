class Solution {
    public int totalFruit(int[] fruits) {
        // qn in simple word :  longest subaaray that has exactly 2 elements 
        // Brute force : generate all subarrays, put element in set whereve setlength>2
        // we break and store length and repeat it through getting max len 

        // optimal Tc: o(2n) sc: O(3)

        int left =0;
        int maxlen=0;
        int k=2;
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int right=0;right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            if(map.size()>k){
                /// left pointer shrinking
                while(map.size()>k){
                      map.put(fruits[left],map.getOrDefault(fruits[left],0)-1);
                      map.remove(fruits[left],0);
                      left++;
                }
            }
           int len=right-left+1;
            maxlen=Math.max(maxlen,len);

        }
        return maxlen;
        
    }
}