package practice.codeforces_practice_problems._003_236_A;

import practice.codeforces_practice_problems._01_fast_io.FastReader;
import practice.codeforces_practice_problems._01_fast_io.FastWriter;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        var fr = new FastReader();
        var fw = new FastWriter();

        var line = fr.nextLine();
        var charSet = new HashSet<Character>();

        for (int i = 0; i < line.length(); ++i) {
            charSet.add(line.charAt(i));
        }

        if (charSet.size() % 2 == 0)
            fw.print("CHAT WITH HER!");
        else fw.print("IGNORE HIM!");

        fr.close();
        fw.close();
    }
}
