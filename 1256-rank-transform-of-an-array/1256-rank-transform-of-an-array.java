class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int[] temp=Arrays.copyOf(arr, arr.length);
        Arrays.sort(temp);
        HashMap<Integer,Integer> map= new HashMap<>();
        int rank=1;

        for(int i=0;i<temp.length;i++){
            if(i>0 && temp[i]!=temp[i-1]){
                rank=rank+1;
            }
            map.put(temp[i],rank);
        }
        int ran[]= new int[n];
        for(int i=0;i<arr.length;i++){
            ran[i]=map.get(arr[i]);
        }
        return ran;
        
    }
}