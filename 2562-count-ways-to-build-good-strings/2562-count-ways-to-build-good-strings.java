class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int MOD = 1000000007;
        int[] ways = new int[high + 1];
        ways[0] = 1;

        for (int len = 0; len <= high; len++) {
            if (ways[len] == 0) continue;
            if (len + zero <= high) {
                ways[len + zero] = (ways[len + zero] + ways[len]) % MOD;
            }
            if (len + one <= high) {
                ways[len + one] = (ways[len + one] + ways[len]) % MOD;
            }
        }

        int count = 0;
        for (int i = low; i <= high; i++) {
            count = (count + ways[i]) % MOD;
        }

        return count;
    }
}