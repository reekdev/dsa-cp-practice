package practice.algozenith_codeforces._02_div2a._001_71A;

import practice.algozenith_codeforces._01_fast_io.FastReader;
import practice.algozenith_codeforces._01_fast_io.FastWriter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var fr = new FastReader();
        var fw = new FastWriter();

        var t = fr.nextInt();
        var solver = new Solver();

        while (t-- > 0) {
            var word = fr.nextLine();
            var result = solver.solve(word);
            System.out.println(result);
        }

        fr.close();
        fw.close();
    }
}

class Solver {
    public String solve(String word) {
        var wordLength = word.length();
        if (wordLength > 10) {
            var firstLetter = word.charAt(0);
            var lastLetter = word.charAt(wordLength-1);
            var letterCountInBetween = wordLength-2;

            var sb = new StringBuilder();
            sb.append(firstLetter);
            sb.append(letterCountInBetween);
            sb.append(lastLetter);
            return sb.toString();
        }
        return word;
    }
}