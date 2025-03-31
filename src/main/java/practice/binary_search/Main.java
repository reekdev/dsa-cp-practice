package practice.binary_search;

public class Main {

    public static void main(String[] args) {
        var arr = new int[]{1,5,7,9,11,14,17,21,23,89};
        var n = arr.length;
        var x = 89;

        var left = 0;
        var right = n - 1;
        var ans = 0;

        while (left <= right) {
            var mid = (left+right)/2;

            if (arr[mid] <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(arr[ans]);
    }
}
