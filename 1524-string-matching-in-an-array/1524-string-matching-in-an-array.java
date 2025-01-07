class Solution {
    public List<String> stringMatching(String[] word) {
        List<String> res = new ArrayList<>();
        for(int i=0;i<word.length;i++){
            for(int j=0;j<word.length;j++){
                if(i!=j && word[j].contains(word[i])){
                    res.add(word[i]);
                    break;
                }
            }
        }
        return res;
    }
}