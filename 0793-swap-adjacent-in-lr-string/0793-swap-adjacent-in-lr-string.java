class Solution {
    public boolean canTransform(String s, String r) {
        int n=s.length();
        int i=0;
        int j=0;
        while(i<n || j<n){
            while(i<n && s.charAt(i)=='X') i++;
            while(j<n && r.charAt(j)=='X') j++;

            if(i==n && j==n) return true;
            if(i==n || j==n) return false;

            if(s.charAt(i)!=r.charAt(j)) return false;

            if(s.charAt(i)=='L' && i<j) return false;
            if(r.charAt(j)=='R' && i>j) return false;
            i++;
            j++;

        }
        return true;

    }
}