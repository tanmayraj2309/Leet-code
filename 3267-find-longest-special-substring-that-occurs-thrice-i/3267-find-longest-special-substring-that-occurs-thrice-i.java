class Solution {
    public int maximumLength(String s) {
        int n=s.length();
        int maxlen=-1;
      
        HashMap<String,Integer> map= new HashMap<>();

        for(int i=0;i<n;i++){
            StringBuilder currstr= new StringBuilder();
            for(int j=i;j<n;j++){
                if(currstr.length()==0 || s.charAt(j)==currstr.charAt(currstr.length()-1)){
                    currstr.append(s.charAt(j));
                    String str=currstr.toString();
                    map.put(str,map.getOrDefault(str,0)+1);
                }
                else{
                    break;
                }

            }
        }
         for (String key : map.keySet()) {
            if (map.get(key) >= 3) {
                maxlen = Math.max(maxlen, key.length());
            }
        }

        return maxlen;
    }
}