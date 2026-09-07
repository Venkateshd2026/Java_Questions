class Solution {
    public int distinctSubseqII(String s) {
        int MOD = 1000000007;

        long[] dp = new long[26];

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';

            long total = 1;

            for (int j = 0; j < 26; j++) {
                total = (total + dp[j]) % MOD;
            }

            dp[index] = total;
        }

        long answer = 0;

        for (int i = 0; i < 26; i++) {
            answer = (answer + dp[i]) % MOD;
        }

        return (int) answer;
    }
}