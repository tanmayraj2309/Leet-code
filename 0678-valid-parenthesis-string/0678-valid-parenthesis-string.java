class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> flag= new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(i);
            }
            else if(ch=='*'){
                flag.push(i);
            }
            else if(ch==')'){
                if(!st.isEmpty()){
                    st.pop();
                }
                else if(!flag.isEmpty()){
                    flag.pop();
                }
                else {
                    return false;
                }
            }
        }
        while(!st.isEmpty() && !flag.isEmpty()){
            if(st.peek()>flag.peek()){
                return false;
            }
            st.pop();
            flag.pop();
        }

        return st.isEmpty();
    }
}