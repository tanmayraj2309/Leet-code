class Solution {
    public boolean canTransform(String s, String r) {

        // its two ponter aproach 
        int n=s.length();
        int i=0;
        int j=0;
        while(i<n || j<n){
             /// saare x ko skip escape krege kyon ki subsequence check krne ke liye
            while(i<n && s.charAt(i)=='X') i++;
            while(j<n && r.charAt(j)=='X') j++;
         


            /// agr dono ka pointer traverse hoke equal ho jayega iska mtlb same
            // sequence me hai so true return krege

            if(i==n && j==n) return true;
            // isme ek pura traverse krkr khtm ho jayega aur dusra ka bcha hi rhega tb false ho jayega

            if(i==n || j==n) return false;
             

            // after skipping "X" dekege hr ke char matchh ho rha ki nhi agr nhi hua toh return false
            if(s.charAt(i)!=r.charAt(j)) return false;

            //  yha ye check kr rhe hai ki khi j pointer nikal jayega toh keft me shift kaise 
            // hoga isliye false return krgee aur niche wla iska ulta hoga
            if(s.charAt(i)=='L' && i<j) return false;
            if(r.charAt(j)=='R' && i>j) return false;
            i++;
            j++;

        }

        // after checking all false condition return true 
        return true;

    }
}