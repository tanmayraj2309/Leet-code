class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        int count=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.size()==0 || !map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
                if(map.get(s.charAt(i))==3){
                    map.put(s.charAt(i),1);
                    count++;
                }
            }
        }        
        return (n - (count*2));
    }
}