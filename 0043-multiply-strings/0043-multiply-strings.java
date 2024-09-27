import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger n1=new BigInteger(num1);
        BigInteger n2=new BigInteger(num2);
        BigInteger pro=n1.multiply(n2);
        return pro.toString();
        
    }
}