package practice.codeforces_practice_problems._002_228_A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        var br = new BufferedReader(new InputStreamReader(System.in));
        var st = new StringTokenizer(br.readLine(), " ");

        var arr = new int[4];
        var currentIndex = 0;
        while (st.hasMoreTokens()) {
            arr[currentIndex++] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Arrays.toString(arr));

        var set = new HashSet<Integer>();
        for (int i : arr) {
            set.add(i);
        }

        System.out.println(4 - set.size());
    }
}
