class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int[][] dp = triangle.clone();

        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = dp[i - 1][0] + triangle[i][0];
            dp[i][dp[i].length - 1] = dp[i - 1][dp[i - 1].length - 1] + triangle[i][dp[i].length - 1];
        }
        for (int i = 1; i < triangle.length; i++) {
            for (int j = 1; j < triangle[i].length - 1; j++) {
                dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
            }
        }

        for (int i = 0; i < dp[dp.length - 1].length; i++) {
            answer = Math.max(answer, dp[dp.length - 1][i]);
        }
        return answer;
    }
}