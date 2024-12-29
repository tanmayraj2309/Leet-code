import java.util.*;

class Solution
{
    public int numWays(String[] words, String target)
    {
        final int MOD = 1_000_000_007;
        int n = words[0].length(); // Number of columns
        int m = target.length();   // Length of the target
        
        // Step 1: Precompute character frequencies for each column
        int[][] charFrequency = new int[n][26];
        for (String word : words)
        {
            for (int j = 0; j < n; j++)
            {
                charFrequency[j][word.charAt(j) - 'a']++;
            }
        }
        
        // Step 2: Initialize a DP array
        int[] dp = new int[m + 1];
        dp[0] = 1; // Base case: 1 way to form an empty target
        
        // Step 3: Iterate through columns
        for (int col = 0; col < n; col++)
        {
            // Step 4: Update DP array in reverse to avoid overwriting
            for (int targetIndex = m - 1; targetIndex >= 0; targetIndex--)
            {
                char targetChar = target.charAt(targetIndex);
                int count = charFrequency[col][targetChar - 'a'];
                
                if (count > 0) 
                {
                    dp[targetIndex + 1] = (int)((dp[targetIndex + 1] + (long)dp[targetIndex] * count % MOD) % MOD);
                }
            }
        }
        
        // Step 5: Return the result
        return dp[m];
    }
}