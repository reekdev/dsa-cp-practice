package practice.codeforces_practice_problems._001_231_A;

import practice.codeforces_practice_problems._01_fast_io.FastReader;
import practice.codeforces_practice_problems._01_fast_io.FastWriter;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int ans;
        var fr = new FastReader();
        var fw = new FastWriter();

        var t = fr.nextInt();
        ans = 0;
        while (t-- > 0) {
            var arr = new int[3];
            var index = 0;
            var line = fr.nextLine();
            var tokenizer = new StringTokenizer(line, " ");
            while (tokenizer.hasMoreTokens()) {
                arr[index++] = Integer.parseInt(tokenizer.nextToken());
            }
            var solver = new Solver();
            var solution = solver.solve(arr);
            ans = solution ? ans + 1 : ans;
        }


        fw.print(ans);

        fr.close();
        fw.close();
    }
}

class Solver {
    public boolean solve(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == 1) count++;
        }
        return count >= 2;
    }
}