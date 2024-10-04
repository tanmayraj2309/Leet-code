class Solution {
    public long dividePlayers(int[] skill) {
         Arrays.sort(skill);
         long result=0;
         int i=0;
         int j=skill.length-1;
         int target=skill[i]+skill[j];
         while(i<j){
                if(skill[i]+skill[j]!=target){
                    return -1;
                }
                result+=skill[i]*skill[j];
                i++;
                j--;
         }
         return result;
        
    }
}