class Solution {
    /*
    Looks like DP problem
    min_cost[R][n] = min_cost[B][n-1] + min_cost[G][n-1]
    min_cost[B][n] = min_cost[R][n-1] + min_cost[][n-1]s
    */
    public int minCost(int[][] costs) {
        int[][] dp = new int[costs.length + 1][3];
        dp[0][0] = 0;
        dp[0][1] = 0;
        dp[0][2] = 0;

        for (int i = 0; i < costs.length; i++) {
            dp[i + 1][0] = costs[i][0] + Math.min(dp[i][1], dp[i][2]);
            dp[i + 1][1] = costs[i][1] + Math.min(dp[i][0], dp[i][2]);
            dp[i + 1][2] = costs[i][2] + Math.min(dp[i][0], dp[i][1]);
        }

        return Math.min(dp[costs.length][0],
            Math.min(dp[costs.length][1], dp[costs.length][2]));
    }
}