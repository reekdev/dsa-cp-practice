package algorithms.binary_search.lower_bound_upper_bound;

public class Main {
    public static void main(String[] args) {
        var arr = new int[]{2, 2};
        var target = 3;
        var solver = new Solution();
        var lowerBoundIndex = solver.lowerBound(arr, target);
        var upperBoundIndex = solver.upperBound(arr, target);

        System.out.printf("lb: %d\n", lowerBoundIndex);
        System.out.printf("ub: %d\n", upperBoundIndex);
    }
}


class Solution {
    /*
    If the index of lower bound is equal to array length
    that means there is no element in the array that is equal to or larger than target.
     */
    public int lowerBound(int[] arr, int target) {
        int n = arr.length;
        int ans = n;
        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = start + ((end - start) >> 1);
            if (arr[mid] >= target) {
                ans = mid; end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }


    /*
    If the index of lower bound is equal to array length
    that means there is no element in the array that is larger than target.
     */
    public int upperBound(int[] arr, int target) {
        int n = arr.length;
        int ans = n;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + ((end - start) >> 1);
            if (arr[mid] > target) {
                ans = mid; end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}