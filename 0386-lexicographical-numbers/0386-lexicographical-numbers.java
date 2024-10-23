class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> nums=new ArrayList<>();
        for(int i=1;i<=n;i++){
            nums.add(String.valueOf(i));

        }
        Collections.sort(nums);
        return nums.stream().map(Integer::parseInt).collect(Collectors.toList());
        

    }
}