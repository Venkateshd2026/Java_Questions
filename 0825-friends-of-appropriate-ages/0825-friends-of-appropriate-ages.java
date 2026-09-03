class Solution {
    public int numFriendRequests(int[] ages) {
        int[] count = new int[121];
        for (int age : ages) {
            count[age]++;
        }
        int ans = 0;
        for (int x = 1; x <= 120; x++) {
            for (int y = 1; y <= 120; y++) {
                if (y <= 0.5 * x + 7) {
                    continue;
                }
                if (y > x) {
                    continue;
                }
                if (y > 100 && x < 100) {
                    continue;
                }
                ans += count[x] * count[y];
                if (x == y) {
                    ans -= count[x];
                }
            }
        }
        return ans;
    }
}