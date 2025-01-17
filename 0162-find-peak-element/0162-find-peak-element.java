public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        int ans = findPeakElement(arr);
        System.out.println(ans);
    }

    static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // Check if the mid element is a peak
            if (nums[mid] > nums[mid + 1]) {
                // The peak might be on the left side, so update 'end'
                end = mid;
            } else {
                // The peak might be on the right side (including mid), so update 'start'
                start = mid + 1;
            }
        }

        // 'start' or 'end' can be returned, as they will be equal at the end of the loop
        return start;
    }
}
