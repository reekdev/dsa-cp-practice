package practice.algozenith_codeforces._02_div2a._002_1903_A;


import practice.algozenith_codeforces._01_fast_io.FastReader;
import practice.algozenith_codeforces._01_fast_io.FastWriter;

import java.io.IOException;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        var fr = new FastReader();
        var fw = new FastWriter();

        var t = fr.nextInt();
        var solver = new Solver();

        while (t-- > 0) {
            final var  N =  fr.nextInt();
            final var K = fr.nextInt();

//            var arr = new int[N];
//            for (int i = 0; i < N; ++i)
//                arr[i] = fr.nextInt();

            final var arr = IntStream.range(0, N).map(i -> fr.nextInt()).toArray();

            var ans = solver.solve(N, K, arr);
            fw.println(ans);
        }

        fr.close();
        fw.close();
    }
}

class Solver {
    public String solve(int N, int K, int[] arr) {
        var isArrayNonDecreasing = isArrayNonDecreasing(arr);
        if (isArrayNonDecreasing) return "YES";
        if (K <= 1) return "NO";
        return "YES";
    }

    private boolean isArrayNonDecreasing(int[] arr) {
        var isNonDecreasing = true;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < arr[i-1]) isNonDecreasing = false;
        }
        return isNonDecreasing;
    }
}