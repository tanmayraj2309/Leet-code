class Solution {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
        for(char c: s.toCharArray()){
            if(!st.isEmpty()){
                char top=st.peek();
                if((c=='B' && top=='A')|| (c=='D'&& top=='C')){
                    st.pop();
                    continue;
                }
            }
              st.push(c);
        }
        return st.size();
    }
}