package algorithms.binary_search.floor_and_ceil;

/**
 * Floor: largest number that is <= m
 * Ceil: smallest number that is >= m
 * <p>
 * arr = [10, 20, 30, 40, 50] and m = 27
 * then floor = 20
 * then ceil = 30
 */

public class Main {
    public static void main(String[] args) {
        var arr = new int[]{3, 4, 4, 7, 8, 10};
        var target = 2;
        var solver = new Solution();
        var floorIndex = solver.findFloor(arr, target);
        var ceilIndex = solver.findCeil(arr, target);

        int floorElement = floorIndex == -1 ? -1 : arr[floorIndex];
        int ceilElement = ceilIndex == -1 ? -1 : arr[ceilIndex];


        System.out.printf("[Floor]\nIndex: %d, Element: %d\n", floorIndex, floorElement);
        System.out.printf("[Ceil]\nIndex: %d, Element: %d\n", ceilIndex, ceilElement);
    }
}


class Solution {


    public int findFloor(int[] arr, int target) {
        var ans = -1;
        var start = 0;
        var end = arr.length - 1;
        while (start <= end) {
            var mid = (start + end) / 2;
            if (arr[mid] <= target) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public int findCeil(int[] arr, int target) {
        var ans = -1;
        var start = 0;
        var end = arr.length - 1;
        while (start <= end) {
            var mid = (start + end) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}