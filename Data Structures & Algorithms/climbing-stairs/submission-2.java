class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        memo[0]=1;
        return dp(n, memo);
        // return memo[n-1];
    }

    public int dp(int n, int[] memo) {
        if (n <= 1) {
            return 1;
        }

        if (memo[n - 1] == -1) {
            int result = dp(n - 1, memo)+dp(n-2,memo);
            memo[n - 1] = result;
        }

        return memo[n - 1];
    }
}
