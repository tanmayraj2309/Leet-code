class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(nums1[i] == nums2[j] && !arr.contains(nums1[i])){
                    arr.add(nums1[i]);
                }
            }
        }
        
        int[] result = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }
        return result;
    }
}
