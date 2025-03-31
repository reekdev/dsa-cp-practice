package practice.codeforces_practice_problems._01_fast_io;

import java.io.*;

public class FastWriter {
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
