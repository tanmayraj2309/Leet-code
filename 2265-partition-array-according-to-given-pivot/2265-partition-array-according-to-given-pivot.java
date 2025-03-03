class Solution {
    public int[] pivotArray(int[] nums, int pivot) { 
          List<Integer> left = new ArrayList<>();
            List<Integer> middle = new ArrayList<>();
              List<Integer> right = new ArrayList<>();

        
       for(int num:nums){
        if(num<pivot){
            left.add(num);
        }
        else if(num==pivot){
            middle.add(num);
        }
        else{
            right.add(num);
        }
       }

       int[] merge=new int[nums.length];
       int index=0;

       for(int num:left){
        merge[index]=num;
        index++;
       }
       for(int num:middle){
        merge[index]=num;
        index++;
       }
       for(int num:right){
        merge[index]=num;
        index++;

       }
       return merge;



    }
}