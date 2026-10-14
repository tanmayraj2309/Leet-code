class Solution {
    public String maxSumOfSquares(int num, int sum) { 
        // base case
        StringBuilder ans = new StringBuilder();
    //   for greater no's  base case 
    // like num=7, sum 60 it's valid 9999996
    if(sum> 9*num) return "";;
       while(num-->0){
        int digit=Math.min(9,sum);
        ans.append(digit);
        sum-=digit;
       }

        return ans.toString();
    }
}