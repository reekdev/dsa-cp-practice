package practice.algozenith_codeforces.__testground;

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
        var solver = new Solver();

        var t = fr.nextInt();

        while (t-- > 0) {
            var n = fr.nextInt();
            var arr = new long[n];
            for (int i = 0; i < n; ++i)
                arr[i] = fr.nextLong();

            var ans = solver.solve(arr);
            fw.println(ans);
        }

        fr.close();
        fw.close();
    }
}

class Solver {
    public long solve(long[] arr) {
        var minDiff = Long.MAX_VALUE;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < arr[i-1]) return 0;
            minDiff = Math.min(minDiff, arr[i]-arr[i-1]);
        }

        return minDiff/2 + 1;
    }
}

class FastReader {
    BufferedReader br;
    StringTokenizer st;
    public FastReader(){
        br=new BufferedReader(new InputStreamReader(System.in));
    }
    private String next(){
        while(st==null || !st.hasMoreTokens()){
            try {
                st=new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    public int nextInt(){
        return Integer.parseInt(next());
    }
    public long nextLong(){
        return Long.parseLong(next());
    }
    public double nextDouble(){
        return Double.parseDouble(next());
    }
    public String nextLine(){
        String str="";
        try {
            str=br.readLine().trim();
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