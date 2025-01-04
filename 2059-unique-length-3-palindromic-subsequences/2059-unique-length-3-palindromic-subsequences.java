class Solution {
    public int countPalindromicSubsequence(String s) {
          int res = 0;
        HashMap<Character,Integer> m = new HashMap<>();
        char arr[] = s.toCharArray();
        int n = arr.length;
        for(int i=n-1;i>=0;i--) m.put(arr[i],i);
        for(int i=n-1;i>=0;i--){
            int a = m.get(arr[i]);
            if(a>=i) continue;
            HashSet<Character> set = new HashSet<>();
            for(int j=a+1;j<i;j++){
                if(!set.contains(arr[j])){
                    res = res+1;
                    set.add(arr[j]);
                }
            }
            m.put(arr[i],i);
        }
        return res;
    }
}