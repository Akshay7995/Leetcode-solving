class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[3];

        int[] sum = new int[n - k + 1];
        int windowSum = 0;
        for (int i = 0; i < n; i++) {
            windowSum += nums[i];
            if (i >= k - 1) {
                sum[i - k + 1] = windowSum;
                windowSum -= nums[i - k + 1];
            }
        }
        int[] left = new int[sum.length];
        int maxIndex = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] > sum[maxIndex]) {
                maxIndex = i;
            }
            left[i] = maxIndex;
        }
        int[] right = new int[sum.length];
        maxIndex = sum.length - 1;
        for (int i = sum.length - 1; i >= 0; i--) {
            if (sum[i] >= sum[maxIndex]) { 
                maxIndex = i;
            }
            right[i] = maxIndex;
        }

        int maxSum = 0;
        for (int j = k; j < sum.length - k; j++) {
            int i = left[j - k]; 
            int l = right[j + k]; 
            int total = sum[i] + sum[j] + sum[l];
            if (total > maxSum) {
                maxSum = total;
                result[0] = i;
                result[1] = j;
                result[2] = l;
            }
        }
        return result;
    }
}
