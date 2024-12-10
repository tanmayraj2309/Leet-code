class Solution {
    public int maximumLength(String s) {
        int n=s.length();
        int maxlen=-1;
       // for counting each substring how man time it comes uske liye hasmap use krege
        HashMap<String,Integer> map= new HashMap<>();

        for(int i=0;i<n;i++){
            StringBuilder currstr= new StringBuilder();
            for(int j=i;j<n;j++){

                // special substring check krne ke liye heck krege 
                //ek pichla wla char same toh nhi hai
                if(currstr.length()==0 || s.charAt(j)==currstr.charAt(currstr.length()-1)){
                    currstr.append(s.charAt(j));
                    String str=currstr.toString();

                    // then phir map woh substring ko count dege
                    map.put(str,map.getOrDefault(str,0)+1);
                }
                else{
                    break;
                }

            }
        }
      // after that check krege jo bhi substring length me max ho aur atleast 3 baar aaya ho
         for (String key : map.keySet()) {
            if (map.get(key) >= 3) {
                maxlen = Math.max(maxlen, key.length());
            }
        }

        return maxlen;
    }
}