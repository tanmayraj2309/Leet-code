class Solution {
    public int takeCharacters(String s, int k) {
        int count[] = new int[3];
        for(char c:s.toCharArray())  count[c-'a'] +=1;
        int min = s.length(),start=0;
        if(count[0]<k || count[1]<k || count[2]<k) return -1;
        for(int end =0;end<s.length();end+=1){
            count[s.charAt(end)-'a'] -=1;

            while(start<=end && (count[0]<k || count[1]<k || count[2]<k)){
                count[s.charAt(start++)-'a']+=1;
            }
            min = Math.min(min, s.length() - (end-start+1));
        }
        return min;
    }
}