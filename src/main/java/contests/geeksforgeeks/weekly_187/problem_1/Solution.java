package contests.geeksforgeeks.weekly_187.problem_1;

enum SolveStrategy {
    DP_ARRAY,
    SPACE_OPTIMIZED_LEVEL_ONE,
    SPACE_OPTIMIZED_LEVEL_TWO
}


public class Solution {
    /**
     * There are 3 distinct terms in the problem
     * 1. term1 = n * f(n-1)
     * 2. term2 = (n-1) * f(n-2)
     * 3. term3 = (n-2) * 3
     * we need to do term1 - term2 + term3
     */
    public int nthTerm(int n, SolveStrategy strategy) {
        int res = -1;

        switch(strategy) {
            case DP_ARRAY -> res = solveWithDpArray(n);
            case SPACE_OPTIMIZED_LEVEL_ONE -> res = solveWithSpaceOptimizedLevelOne(n);
            case SPACE_OPTIMIZED_LEVEL_TWO -> res = solveWithSpaceOptimizedLevelTwo(n);
        }

        return res;
    }

    protected int solveWithDpArray(int n) {
        final int MOD = (int)1e9+7;
        if (n <= 0) throw new IllegalArgumentException("Input must be a positive number");
        if (n == 1 || n == 2) return 1;


        long[] dp = new long[n+ 1];
        dp[1] = dp[2] = 1;

        for (int i = 3; i <= n; ++i) {
            long term1 = (1L * i * dp[i-1]) % MOD;
            long term2 = (1L * (i-1) * dp[i-2]) % MOD;
            long term3 = (1L * (i-2) * 3) % MOD;

            /**
             * We can go with either of these approaches for handling negative numbers
             */

            // MOD is added to handle negative values
            // dp[i] = (term1 - term2 + term3 + MOD) % MOD;

            int currentTerm = -1;
            currentTerm = (int)((term1 - term2 + MOD) % MOD); // MOD is added to handle negative value
            currentTerm = (int)((currentTerm + term3) % MOD);

            dp[i] = currentTerm;
        }

        return (int)dp[n];
    }

    protected int solveWithSpaceOptimizedLevelOne(int n) {
        if (n <= 0) throw new IllegalArgumentException("Input must be a positive number");
        if (n == 1 || n == 2) return 1;

        final int MOD = (int)1e9+7;

        /**
         * in this approach we will take 3 variables and update them accordingly as we move
         * because we don't need an entire array, since it increase a space usage
         */
        long prev2 = 1; // f(1)
        long prev1 = 1; // f(2)
        long current = 0; // this is going to carry the current value inside the loop

        for (int i = 3; i <= n; ++i) {
            long term1 = (1L * i * prev1) % MOD;
            long term2 = (1L * (i-1) * prev2) % MOD;
            long term3 = (1L * (i-2) * 3) % MOD;

            current = (term1 - term2 + term3 + MOD) % MOD;

            prev2 = prev1;
            prev1 = current;
        }

        return (int)current;
    }

    protected int solveWithSpaceOptimizedLevelTwo(int n) {
        if (n <= 0) throw new IllegalArgumentException("Input must be a positive number");
        if (n == 1 || n == 2) return 1;

        final int MOD = (int)1e9+7;

        /**
         * in this approach we will take 3 variables and update them accordingly as we move
         * because we don't need an entire array, since it increase a space usage
         *
         * in this better space optimized version, we use a int instead of long
         */
        int prev2 = 1; // f(1)
        int prev1 = 1; // f(2)
        int current = 0; // this is going to carry the current value inside the loop

        for (int i = 3; i <= n; ++i) {
            long term1 = (1L * i * prev1) % MOD;
            long term2 = (1L * (i-1) * prev2) % MOD;
            long term3 = (1L * (i-2) * 3) % MOD;

            current = (int)((term1 - term2 + MOD) % MOD);
            current = (int)((current + term3) % MOD);

            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }

}
