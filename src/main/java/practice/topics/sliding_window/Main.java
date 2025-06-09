package practice.topics.sliding_window;

public class Main {
    public static void main(String[] args) {
        var nums = new int[]{11,13,17,23,29,31,7,5,2,3};
        var k = 3;
        var t = 5;
        var solution = new Solution();
//        System.out.println(solution.numOfSubarrays(nums, k, t));
        System.out.println((int)1e9+7 < 998244353);
    }
}

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        double sum = 0;
        for (int i = 0; i < k; ++i) {
            sum += arr[i];
        }
        if (sum/k >= threshold) ++count;

        for (int i = k; i < arr.length; ++i) {
            sum = sum - arr[i-k] + arr[i];
            if (sum/k >= threshold) ++count;
        }

        return count;
    }
}
