package contests.atcoder.beginner_contests._399;

import contests._01_fast_io.FastReader;
import contests._01_fast_io.FastWriter;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        var fr = new FastReader();
        var fw = new FastWriter();

        var N = fr.nextInt();
        var S = fr.nextLine();
        var T = fr.nextLine();

        var ans = 0;
        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) != T.charAt(i)) ++ans;
        }

        System.out.println(ans);

        fr.close();
        fw.close();
    }
}
