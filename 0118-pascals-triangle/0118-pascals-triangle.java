class Solution {
    public List<List<Integer>> generate(int numRows) {
        // optimal approach 
        List<List<Integer>> result= new ArrayList<>();
        for(int row=1;row<=numRows;row++){
            result.add(genrow(row));
        }
        return result;
        
    }

    // creating a function to genrating each row of pacal tiangle
    public static List<Integer> genrow(int n){
        ArrayList<Integer> res=new ArrayList<>();
        res.add(1);
        long ans=1;
        for(int c=1;c<n;c++){
            ans=ans*(n-c);
            ans=ans/(c);
            res.add((int)ans);
        }
        return res;
    }
}