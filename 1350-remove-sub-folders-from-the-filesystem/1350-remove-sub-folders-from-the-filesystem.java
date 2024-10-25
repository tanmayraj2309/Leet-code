class Solution {
    public List<String> removeSubfolders(String[] folder) {
        ArrayList<String> ans=new ArrayList<>();
        Arrays.sort(folder);
        ans.add(folder[0]);
        String prev=folder[0];
        for(int i=1;i<folder.length;i++ ){
            String str=folder[i];
            if(!str.startsWith(prev+"/")){
                ans.add(str);
                prev=str;
            }
        }
        return ans;
        
        
    }
}