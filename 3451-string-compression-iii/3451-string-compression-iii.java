class Solution {
    public String compressedString(String word) {
        StringBuilder result= new StringBuilder();
        int count=1;
        char currch=word.charAt(0);
        for(int i=1;i<word.length();i++){
            char nextch=word.charAt(i);
            if(nextch==currch && count<9){
                count++;
            }
            else{
                result.append(count).append(currch);
                currch=nextch;
                count=1;
            }

        }
        result.append(count).append(currch);
        return result.toString();       
    }
}