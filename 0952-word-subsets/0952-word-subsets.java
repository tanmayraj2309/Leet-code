class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        

        // intialization of freq array of size 26 to take the freq of words 2 array char 

        int freq[]= new int[26];

        for(String word:words2){
            int temp[]=getfreq(word);
            for(int i=0;i<26;i++){
                freq[i]=Math.max(freq[i],temp[i]);
            }
        }

        // result List Intaialization 
        List<String> res = new ArrayList<>();
        for(String word: words1){
            int temp[]=getfreq(word); 
            boolean flag=true;
            for(int i=0;i<26;i++){
                if(freq[i]>temp[i]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                res.add(word);
            }
        }
        return res;

    }

    // this method or function find freq of every word in the array
    public int[] getfreq(String word){
        int freq[]=new int[26];
        for(int i=0;i<word.length();i++){
            // converting  word char in integer in index form 
            freq[word.charAt(i)-'a']++;
        }
        return freq;

    }
}