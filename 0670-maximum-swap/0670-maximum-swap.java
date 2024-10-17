class Solution {
    public int maximumSwap(int num) {
        char nums[]=Integer.toString(num).toCharArray();
        int n=nums.length;
        int swapindx1=-1;
        int swapindx2=-1;
        int maxindx=n-1;

        char maxelem=nums[n-1];

        for(int i=n-2;i>=0;i--){
            if(nums[i]>maxelem){
                maxelem=nums[i];
                maxindx=i;
            }
            else if(nums[i]<maxelem){
                swapindx1=i;
                swapindx2=maxindx;
            }
          
        }
         if(swapindx1!=-1){
                char temp=nums[swapindx1];
                nums[swapindx1]=nums[swapindx2];
                nums[swapindx2]=temp;
            }
            
            return Integer.parseInt(new String(nums));
    }
}