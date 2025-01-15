class Solution {
    public int minimizeXor(int num1, int num2) {
        int setBitsInNum2 = Integer.bitCount(num2);
        int currentSetBits = Integer.bitCount(num1);
        while (currentSetBits != setBitsInNum2) {
            if (currentSetBits < setBitsInNum2) {
                num1++;
            } else {
                num1--;
            }
            currentSetBits = Integer.bitCount(num1);
        }
        
        return num1;
    }
}