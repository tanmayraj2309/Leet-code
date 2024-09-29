class Solution {
    public double myPow(double x, long n) {
          if (n == 0) {
            return 1;
        }
        
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double temp = myPow(x, n / 2);
        double ans;
        
        if (n % 2 == 0) {
            ans = temp * temp;
        } else {
            ans = temp * temp * x;
        }
        
      
        return ans;
    }
}