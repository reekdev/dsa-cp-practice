package contests.geeksforgeeks.weekly_199.problem_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            var n = sc.nextInt();
            var d = sc.nextInt();

            var arr = new long[d][2];

            for (int i = 0; i < d; ++i) {
                arr[i][0] = sc.nextLong();
                arr[i][1] = sc.nextLong();
            }

            var solution = new Solution();
            var ans = solution.uniqueSize(n, d, arr);
            System.out.println("Answer: " + ans);
        }
    }
}
