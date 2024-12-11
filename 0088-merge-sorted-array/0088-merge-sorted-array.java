class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=0;i<nums1.length;i++){
            if(i>=m){
                if(nums1[m]==0){
                   nums1[m]=nums2[j];
                   j++;
                   m++;
                }
            }
        }
        Arrays.sort(nums1);
    }
}