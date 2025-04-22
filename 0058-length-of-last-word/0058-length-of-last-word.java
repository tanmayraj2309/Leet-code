class Solution {
    public int lengthOfLastWord(String s) {
        String[] sep = s.split(" ");
        return sep[sep.length-1].length();
    }
}