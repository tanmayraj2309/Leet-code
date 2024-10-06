class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1.length()>sentence2.length()){
            return areSentencesSimilar(sentence2,sentence1);
        }
        String s[]=sentence1.split(" ");
        String l[]=sentence2.split(" ");
        int start=0;
        int end1=s.length-1;
        int end2=l.length-1;

        // find prefix words
        while(start<=end1 && s[start].equals(l[start])){
            start++;
        }

        // find suffix
           while(start<=end1 && s[end1].equals(l[end2])){
            end1--;
            end2--;
        }
        return (start>end1);
        


    }
}