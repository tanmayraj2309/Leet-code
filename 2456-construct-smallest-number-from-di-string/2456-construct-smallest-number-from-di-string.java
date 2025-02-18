class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder res= new StringBuilder();
        Stack<Integer> st= new Stack<>();

        for(int i=0;i<=pattern.length();i++){
              st.push(i+1);
              if(i==pattern.length() || pattern.charAt(i)=='I'){
                while(!st.isEmpty()){
                    res.append(st.pop());
                }
              }
        }
        return res.toString();
    }
}