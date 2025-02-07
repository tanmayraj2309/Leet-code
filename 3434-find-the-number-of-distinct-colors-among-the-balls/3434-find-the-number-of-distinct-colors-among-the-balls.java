class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int[] ans = new int[queries.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> color = new HashMap<>();
        for(int i = 0 ; i < queries.length ; i++){
            if(color.containsKey(queries[i][0])){
                int prev = color.get(queries[i][0]);
                map.put(prev,map.get(prev)-1);
                if(map.get(prev)==0){
                    map.remove(prev);
                }
            }
            map.put(queries[i][1],map.getOrDefault(queries[i][1],0)+1);
            color.put(queries[i][0],queries[i][1]);
            ans[i] = map.size();
        }
        return ans;
    }
}