class Solution {
    public boolean isPrime(int num){
        if(num == 1)return false;
        if(num == 2)return true;
        for(int i=2;i*i<=num;i++){
            if(num % i == 0)return false;
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        List<Integer> list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        while(left <= right){
            if(isPrime(left)){
                list.add(left);
            }
            left++;
        }
        for(int i=0;i<list.size()-1;i++){
            int diff=list.get(i+1) - list.get(i);
            if(diff < min){
                ans[0]=list.get(i);
                ans[1]=list.get(i+1);
            }
            min=Math.min(min,diff);
        }
        return ans;
    }
}