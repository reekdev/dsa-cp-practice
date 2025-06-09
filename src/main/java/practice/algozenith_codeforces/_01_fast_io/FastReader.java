package practice.algozenith_codeforces._01_fast_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastReader {
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
