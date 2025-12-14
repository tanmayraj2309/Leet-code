class Solution {
    int mod=1000000007;
    public int numberOfWays(String corridor) {
        // if seat count is odd return 0   
        // ek odd no chaie like 2nd indices jaha pe 2 count pura ho jaye char ka ; aur phir odd no aaye like 7 th ndex pe 3rd chair ho uke bich difference nikal ke multiply krte aage complete aayega tb tk
             long ans = 1;

        int lastindex=-1;
        int countseats=0;
        for(int i=0;i<corridor.length();i++){
            if(corridor.charAt(i)=='P') continue;
            countseats++;
            if(countseats>=3 && countseats%2==1){
                int bars=i-lastindex;
                ans=(ans*bars)%mod;
            }
              if (countseats % 2 == 0) {
                lastindex = i;
            }
        }
        return (countseats==0||countseats%2==1 ?0: (int) ans);

        
    }
}