class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();

        if(n%2!=0) return false;

        Stack<Integer> st = new Stack<>();
        Stack<Integer> unloc= new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char lock=locked.charAt(i);

            if(lock=='0'){
                unloc.push(i);
            }
            else if(ch=='('){
                st.push(i);
            }
            else{
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    if(!unloc.isEmpty()){
                        unloc.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        while(!st.isEmpty() && !unloc.isEmpty() && st.peek() < unloc.peek() ){
            st.pop();
            unloc.pop();
        }
        
        return (st.isEmpty());
        
    }
}