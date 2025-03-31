package practice.atcoder_dp_contest._01_frog_1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        var fr = new FastReader();
        var fw = new FastWriter();

        var N = fr.nextInt();
        var arr = new int[N];

        for (int i = 0; i < N; ++i)
            arr[i] = fr.nextInt();

        var solution = new Solution(arr, N);
        var ans = solution.fn(N - 1);
        fw.print(ans);
        fr.close();
        fw.close();
    }
}

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    private String next() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public String nextLine() {
        String str = "";
        try {
            str = br.readLine().trim();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    public void close() throws IOException {
        if (br != null) br.close();
    }
}

class FastWriter {
    private final BufferedWriter bw;

    public FastWriter() {
        this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
    }

    public void print(Object object) throws IOException {
        bw.append("" + object);
    }

    public void println(Object object) throws IOException {
        print(object);
        bw.append("\n");
    }

    public void close() throws IOException {
        bw.flush();
        bw.close();
    }
}

class Solution {
    private final int[] arr;
    private final int[] cache;

    public Solution(int[] arr, int N) {
        this.arr = arr;
        this.cache = new int[N];
        Arrays.fill(this.cache, -1);
        this.cache[0] = 0;
    }

    /*
    function objective:
    F(n) -> returns the minimum possible cost using which we can reach Nth stone.
     */
    public int fn(int n) {
        if (this.cache[n] != -1) return this.cache[n];
        int oneJumpPathCost = Integer.MAX_VALUE, twoJumpPathCost = Integer.MAX_VALUE;

        oneJumpPathCost = fn(n - 1) + Math.abs(arr[n] - arr[n - 1]);
        if (n > 1)
            twoJumpPathCost = fn(n - 2) + Math.abs(arr[n] - arr[n - 2]);

        var minimumCost = Math.min(oneJumpPathCost, twoJumpPathCost);
        this.cache[n]= minimumCost;
        return minimumCost;
    }
}