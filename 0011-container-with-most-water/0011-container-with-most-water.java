class Solution {
    public int maxArea(int[] height) {
        
        int s=0;
        int e=height.length-1;
        int max=0;
        int hight=0;
         int width=0;
         int area=0;
        while(s<e){
            hight=Math.min(height[s],height[e]);
             width=(e-s);
             area=hight*width;
            max=Math.max(max,area);
            
            if(height[s]>height[e]){
                e--;
            }
            else{
                s++;
            }

        }
        return max;
    }
}