class Solution {
    public boolean isHappy(int n) {
        int sum =0;
        if(n==1 || n==7 ){
            return true;
        }
        else if(n<10) return false;
        while(n>0){
            int temp=n%10;
            sum=sum+(temp*temp);
            n=n/10;
        }
        return isHappy(sum);

    }
}