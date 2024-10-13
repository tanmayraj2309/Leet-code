class Solution {
    public String reverseWords(String s) {
        Stack<String> st= new Stack<>();
        StringBuilder ans=new StringBuilder();
        String[] words=s.trim().split("\\s+");
     
       
        for(String word :words){
            st.push(word);
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
            if(!st.isEmpty()){
                ans.append(' ');
            }
        }
        return ans.toString();
    }
}