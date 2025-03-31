package practice.codeforces_practice_problems._005_214_A;

import practice.codeforces_practice_problems._01_fast_io.FastReader;
import practice.codeforces_practice_problems._01_fast_io.FastWriter;

import java.io.*;
import java.util.*;

/**
 *  a^2 + b = n
 *  a + b^2 = m
 */

public class Main {
    public static void main(String[] args) throws IOException {
        var fr = new FastReader();
        var fw = new FastWriter();

        var n = fr.nextInt();
        var m = fr.nextInt();
        var ans = 0;

        /**
         * For the 1st eq, the max value of a can be sqrt(n), making b zero
         * For the 2nd eq, the max value of a can be m, making b^2 zero
         */
        for (int a = 0; a * a <= n && a <= m; ++a) {
            var b = n - a * a;
            if (a * a + b == n && a + b * b == m) ans++;
        }

        System.out.println(ans);

        fr.close();
        fw.close();
    }
}
