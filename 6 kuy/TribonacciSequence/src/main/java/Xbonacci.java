import java.util.Arrays;

public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        double[] res = Arrays.copyOf(s, n);
        for (int i = s.length; i < n; i++) {
            res[i] = res[i - 3] + res[i - 2] + res[i - 1];
        }
        return res;
    }
}