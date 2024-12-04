class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int indx1=0;
        int indx2=0;
        int n=str1.length();
        int m=str2.length();
        if(m>n){
            return false;
        }

        while(indx2<m && indx1<n){

            if(str1.charAt(indx1)==str2.charAt(indx2)
              || (str1.charAt(indx1)==str2.charAt(indx2)-1) 
              || (str1.charAt(indx1)=='z' && str2.charAt(indx2)=='a'))
              {
                indx2++;
              }
                 indx1++;

        }

                 return (indx2==m);
    }
}