class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxi=0;
        HashMap<Character,Integer> indexmap= new HashMap<>();
        for(int right=0;right<s.length();right++){
                char c=s.charAt(right);
                if(indexmap.containsKey(c)){
                    left=Math.max(left,indexmap.get(c)+1);
                }
                indexmap.put(c,right); // storing char and their indx
                maxi=Math.max(maxi,(right-left+1));

        }
        return maxi;


    }
}