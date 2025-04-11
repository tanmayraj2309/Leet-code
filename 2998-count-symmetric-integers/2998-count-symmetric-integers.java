class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0 ;
        for(int num= low ; num<= high ; num++){
            if(isSymm(num)){
                count++;
            }
        }
        return count;

        
    }
    private boolean isSymm(int num){
        String myStr = String.valueOf(num);
        int n = myStr.length();

        if(n%2!=0){
            return false;
        }
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n/2;i++){
            sum1+=Character.getNumericValue(myStr.charAt(i));
            sum2+=Character.getNumericValue(myStr.charAt(n-1-i));
        }
        return sum1==sum2;
    }
}