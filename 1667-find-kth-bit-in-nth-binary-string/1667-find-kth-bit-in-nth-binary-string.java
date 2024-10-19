class Solution {
    public char findKthBit(int n, int k) {
        
        String str = "0";
        
        
        for (int i = 1; i < n; i++) {
            
            StringBuilder inverted = new StringBuilder();
            for (char c : str.toCharArray()) {
              
                inverted.append(c == '0' ? '1' : '0');
            }
            
            
            String reversedInverted = inverted.reverse().toString();
            
            
            str = str + "1" + reversedInverted;
        }
        
        return str.charAt(k - 1);
    }
}
