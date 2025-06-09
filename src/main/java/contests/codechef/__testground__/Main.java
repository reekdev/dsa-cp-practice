package contests.codechef.__testground__;

import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        var fr = new FastReader();
        var fw = new FastWriter();
        var t = fr.nextInt();
        while (t-- > 0) {
            var n = fr.nextInt();
            var ans = Solver.solve(n);
            fw.println(ans);
        }
        fr.close();
        fw.close();
    }
}

class Solver {
    public static String solve(int n) {
        var sb = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            if (i <= (n-1)/2) {
                if (i == 0)
                    sb.append(2*i+1);
                else
                    sb.append(" ").append(2*i+1);
            } else {
                sb.append(" ").append(2*(n-i));
            }
        }

        return sb.toString();
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