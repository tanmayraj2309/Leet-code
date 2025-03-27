class Solution {
    public int characterReplacement(String s, int k) {
        int maxlen=0;
        int maxfreq=0;
        int hm[]=new int[26];

        int l=0;
        int r=0;
        int n=s.length();
        while(r<n){
            hm[s.charAt(r)-'A']++;  // Ascii value nikl ke us char ka value ka freq store kr lege
            maxfreq= Math.max(maxfreq,hm[s.charAt(r)-'A']);  // us char ka freq check krke max value store kr rhe hai
            int len=r-l+1; //current window length
            if(len-maxfreq>k)// invalid condition jb hum log char ke value ko change nhi kr skte
            {
                // so ab left  shrink krege  aur freq ko bhi less krege jo left index pe char hoga uska
                hm[s.charAt(l)-'A']--;
                l++;

            }

            maxlen= Math.max(maxlen,r-l+1);
            r++;


        }
        
        return maxlen;
    }
}