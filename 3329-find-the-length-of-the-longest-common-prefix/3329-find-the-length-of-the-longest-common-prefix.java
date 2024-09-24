class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        int n = arr1.length, m = arr2.length;
        for(int num : arr1){
            String s = num+"";
            for(int i = 1; i <= s.length(); i++){
                set.add(Integer.parseInt(s.substring(0,i)));
            }
        }

        int max = 0;
        for(int num : arr2){
            String s = num+"";
            for(int i = 1; i <= s.length(); i++){
                if(set.contains(Integer.parseInt(s.substring(0,i)))){
                    max = Math.max(max, i);
                }
            }
        }
        return max;
    }
}