package contests.geeksforgeeks.weekly_199.problem_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        var arr = new int[]{1, 100, 2, 99, 3, 98};
        var solution = new Solution();

//        System.out.println("Before sorting: " + Arrays.toString(arr));
        var res = solution.calculateSum(arr);
        System.out.println(res);
//        Arrays.sort(arr);
//        System.out.println("After sorting: " + Arrays.toString(arr));

    }
}
