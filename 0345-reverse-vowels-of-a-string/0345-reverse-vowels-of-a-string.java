class Solution {
    public boolean isVowel(char s){
        return s=='A' || s=='a'|| s=='e' || s=='E' || s=='i' || s=='I'|| s=='o' || s=='O' || s=='u' || s=='U';
        
    }
    public String reverseVowels(String st) {
        char[] str= st.toCharArray();
        int n= st.length();
        int s=0;
        int e=n-1;
        while(s<e){
            if(isVowel(str[s]) && isVowel(str[e])){
                swap(str,s,e);
                s++;
                e--;
            }
            else if (!isVowel(str[s])){
                s++;
            }
            else if(!isVowel(str[e])){
                e--;
            }
        }

          return new String(str);

        
    }
    public void swap(char[] arr, int s, int e){
        char temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}