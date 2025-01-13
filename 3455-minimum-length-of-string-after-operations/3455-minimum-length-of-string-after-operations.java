class Solution {
    public int minimumLength(String s) {
        int len=s.length();
        char[] arr=new char[26];
        for(char c:s.toCharArray())
        {
            arr[c-'a']++;
            if(arr[c-'a']==3)
            {
                len-=2;
                arr[c-'a']-=2;
            }
           
        }
        return len;
        
    }
}