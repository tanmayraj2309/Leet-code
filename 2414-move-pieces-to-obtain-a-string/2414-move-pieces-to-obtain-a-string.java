class Solution {
    public boolean canChange(String s, String t) {
        
    //     int n= start.length();
    //     char[] s=start.toCharArray();
    //     char[] c=target.toCharArray();
    //     for(int i=0;i<n;i++){
    //         if(s[i]==c[i]){
    //             continue;
    //         }
    //         else if(s[i]=='_' && c[i]=='_'){
    //             continue;
    //         }
    //         else if( s[i]=='L' && i>0 && s[i-1]=='_')
    //         {
    //                     swap(s, i, i-1);
    //                     i=i--;
    //         }
    //         else if(s[i]=='R' && i<n-1 && s[i+1]=='_'){
    //                    swap(s, i, i+1);
    //         }
    //         else {
    //             return false;
    //         }

    //     }
    //     return Arrays.equals(s, c);
    // }
    // public static void swap(char[] arr, int i, int j) {
    //     char temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;

    int i=0;
    int j=0;
    int n= s.length();
    while(i<n || j<n){
        while(i<n && s.charAt(i)=='_')i++;
        while(j<n && t.charAt(j)=='_')j++;
        if(i==n && j==n) return true;
        if(i==n || j==n) return false;
        
        if(s.charAt(i)!= t.charAt(j)) return false;

        if(s.charAt(i)=='L' && i<j) return false;
        if(s.charAt(i)=='R' && i>j) return false;
        i++;
        j++;


    }
    return true;

    }
}