package contests.geeksforgeeks.weekly_199.problem_1;

import java.util.Arrays;

public class Solution {
    public int calculateSum(int[] arr) {
        // code here
        Arrays.sort(arr);
        int score = 0;
        for (int i = 0; i < (arr.length) / 2; ++i) {
            score += arr[arr.length - 1 - i] - arr[i];
        }

        return score;
    }
}
