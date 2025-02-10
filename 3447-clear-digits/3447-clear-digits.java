class Solution {
    public String clearDigits(String s) {
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                st.push(s.charAt(i));
            }
            else {
                st.pop();
            }
        }
        char[] arr=new char[st.size()];

        for(int i=arr.length-1;i>=0;i--){
            arr[i]=st.pop();
        }
        return new String(arr);

    }
}