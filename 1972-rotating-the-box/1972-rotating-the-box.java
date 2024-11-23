class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length, n=box[0].length;
        char[][] ans = new char[n][m];
        for(int i=0; i<m; i++) {
            // process every row independently
            char[] row = applyGravity(box[i]);
            // convert row to column
            for(int j=0; j<n; j++) {
                ans[j][m-1-i] = row[j];
            }
        }
        return ans;
    }

    private char[] applyGravity(char[] row) {
        int stones=0, cells=0;
        // iterate over the horizontal row, visualizing it as a vertical column
        for(int i=0; i<row.length; i++) {
            if(row[i]=='*') {
                int j=i-1;
                // place stones at the bottom, keep other cells empty of the segment
                while(cells-->0) {
                    if(stones>0) {
                        stones-=1;
                        row[j]='#';
                    } else row[j]='.';
                    j-=1;
                }
                // increment number of stones if found
            } else if(row[i]=='#') stones+=1;
            cells+=1;
        }
        int j = row.length-1;
        // place stones at the bottom, keep other cells empty of the segment
        while(cells-->0) {
            if(stones>0) {
                stones-=1;
                row[j]='#';
            } else row[j]='.';
            j-=1;
        }
        return row;
    }
}