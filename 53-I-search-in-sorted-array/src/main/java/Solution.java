/**
 * <p>
 *
 * </p>
 *
 * @author ceezyyy
 * @since 2021/3/22
 */
class Solution {

    public int search(int[] nums, int target) {

        int index = binarySearch(nums, target);
        if (index == -1) return 0;
        int res = 1;

        // Left
        for (int i = index - 1; i >= 0; i--) {
            if (nums[i] != target) break;
            res++;
        }

        // Right
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] != target) break;
            res++;
        }

        return res;

    }

    public int binarySearch(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;  // left + offset

            if (nums[mid] == target) return mid;
            if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return -1;

    }
}
