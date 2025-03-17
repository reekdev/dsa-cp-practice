package contests.geeksforgeeks.weekly_187.problem_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int t = 0;
        t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n;
            n = Integer.parseInt(br.readLine());
            Solution sol = new Solution();
            int res = sol.nthTerm(n, SolveStrategy.SPACE_OPTIMIZED_LEVEL_TWO);
            System.out.println(res);
        }
    }
}
