package practice.algozenith_codeforces._02_div2a._003_263A;



import practice.algozenith_codeforces._01_fast_io.FastReader;
import practice.algozenith_codeforces._01_fast_io.FastWriter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var fr = new FastReader();
        var fw = new FastWriter();

        var matrix = new int[5][5];

        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                matrix[i][j] = fr.nextInt();
            }
        }

        var solver = new Solver();
        var ans = solver.solve(matrix);

        fw.print(ans);
        fr.close();
        fw.close();
    }
}

class Solver {
    public int solve(int[][] matrix) {
        int rowPosOfOne = 0, colPosOfOne = 0;

        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                if (matrix[i][j] == 1) {
                    rowPosOfOne = i;
                    colPosOfOne = j;
                }
            }
        }

        return Math.abs(rowPosOfOne-2)+Math.abs(colPosOfOne-2);
    }


}