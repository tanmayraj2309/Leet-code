class Solution {
    int mod=1000000007;
    public int countPermutations(int[] complexity) {
        // basically root elenment means index of 0 wla element ka aage ka element use se bdha hona chiye tbhi woh unlock krega 
        int n=complexity.length;
        int first =complexity[0];
        
        for(int i=1;i<n;i++){
            if(complexity[i]<=first){
                return 0;
            }
        }
        return fact(n-1);


    }
    public int fact(int n){
        long ans=1;
        while(n>0){
            ans=(ans*n) % mod;
            n--;

        }
        return (int) ans;
    }
}