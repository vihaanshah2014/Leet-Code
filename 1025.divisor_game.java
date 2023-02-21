class Solution {
    public boolean divisorGame(int n) {
        boolean[] dp = new boolean[n+1];
        
        // Base case: if n = 1, Alice loses
        dp[1] = false;
        
        for (int i = 2; i <= n; i++) {
            // Alice can choose any x with 0 < x < i and i % x == 0
            for (int x = 1; x < i; x++) {
                if (i % x == 0 && !dp[i-x]) {
                    // If Alice can make a move that results in a losing position for Bob,
                    // then Alice wins
                    dp[i] = true;
                    break;
                }
            }
        }
        
        return dp[n];
    }
}
