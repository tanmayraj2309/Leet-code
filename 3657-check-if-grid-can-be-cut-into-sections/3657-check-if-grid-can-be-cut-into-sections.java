class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        return check(rectangles, n) || check2(rectangles, n);
    }

    public boolean check(int[][] rec, int n) {
        Arrays.sort(rec, (a, b) -> Integer.compare(a[0], b[0])); 
        int end = rec[0][2];
        int c = 0;
        for (int i = 0; i < rec.length; i++) {
            if(end <= rec[i][0]){
                
                c++;
            }
            end = Math.max(end,rec[i][2]);
            
        }
         System.out.println(c);
        return c >= 2; 
    }

    public boolean check2(int[][] rec, int n) {
        Arrays.sort(rec, (a, b) -> Integer.compare(a[1], b[1])); 
        int end = rec[0][3];
        int c = 0;
        for (int i = 0; i < rec.length; i++) {
            
             if(end <= rec[i][1]){
                c++;
            } 
            end = Math.max(end,rec[i][3]);
        }
        System.out.println(c);
        return c >= 2;
    }
}