class Solution {
    public long minimumSteps(String s) {
        int lc=0;
        long sc=0;

        for(int curr=0;curr<s.length();curr++){
            if(s.charAt(curr)=='0'){
                sc+=(curr-lc);
                lc++;
            }

        }

        return sc;
    }
}