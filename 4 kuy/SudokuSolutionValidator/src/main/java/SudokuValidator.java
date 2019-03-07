/*public class SudokuValidator {
    public static boolean check(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                for (int i2 = 0; i2 < sudoku.length; i2++) {
                    for (int j2 = 0; j2 < sudoku.length; j2++) {
                        if (sudoku[i][j] == 0)
                            return false;
                        if (i == i2 && j == j2)
                            continue;
                        if (sudoku[i][j] == sudoku[i2][j2])
                            if (i / 3 == i2 / 3 && j / 3 == j2 / 3 || i == i2 || j == j2)
                                return false;
                    }
                }
            }
        }
        return true;
    }
}*/

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;


//* This code not pass "moreRandomSudocu" test.(( *\\
public class SudokuValidator {

    public static boolean check(int[][] sudoku) {
        return checkRows(sudoku) && checkRows(rotateMatrix(sudoku[0].length, sudoku));
    }

    private static boolean checkRows(int[][] sudoku) {
        for (int i = 1; i < 10; i++) {
            if (!arrToStr(sudoku[i - 1]).contains(String.valueOf(i)))
                return false;
        }
        return true;
    }

    @Contract("_, _ -> param2")
    private static int[][] rotateMatrix(int n, int mat[][]) {
        for (int v = 0; v < n / 2; v++) {
            for (int k = v; k < n - v - 1; k++) {
                int temp = mat[v][k];
                mat[v][k] = mat[k][n - 1 - v];
                mat[k][n - 1 - v] = mat[n - 1 - v][n - 1 - k];
                mat[n - 1 - v][n - 1 - k] = mat[n - 1 - k][v];
                mat[n - 1 - k][v] = temp;
            }
        }
        return mat;
    }

    @NotNull
    private static String arrToStr(@NotNull int[] ints) {
        StringBuilder res = new StringBuilder();
        for (int s : ints)
            res.append(s);
        return res.toString();
    }
}


/*
import java.util.Arrays;

public class SudokuValidator {

    public static boolean check(int[][] sudoku) {
        int res = 0;
        for (int[] arr : sudoku) {
            res += Arrays.stream(arr).sum();
        }
        return 405 == res;
    }
}*/
