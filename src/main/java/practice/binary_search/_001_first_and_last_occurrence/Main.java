package practice.binary_search._001_first_and_last_occurrence;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var nums = new int[]{2, 2};
        var target = 2;

        var solution = new Solution();
        var ans = solution.searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }
}

class Solution {
    public int[] searchRange(int[] nums, int target) {
        var lowerBoundIndex = lowerBound(nums, target);
        var upperBoundIndex = upperBound(nums, target);
        if (lowerBoundIndex == nums.length || nums[lowerBoundIndex] != target)
            return new int[]{-1, -1};
        return new int[]{lowerBoundIndex, upperBoundIndex-1};
    }

    public int lowerBound(int[] arr, int target) {
        int n = arr.length;
        int ans = n;
        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                ans = mid; end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public int upperBound(int[] arr, int target) {
        int n = arr.length;
        int ans = n;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                ans = mid; end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
