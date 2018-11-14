public class GpsSpeed {
    public static int gps(int s, double[] x) {
        int result = 0;

        if (x.length <= 0)
            return 0;

        for (int i = 1; i < x.length; i++) {
            if ((int) (((x[i] - x[i - 1]) * 3600) / s) > result) {
                result = (int) (((x[i] - x[i - 1]) * 3600) / s);
            }
        }
        return result;
    }
}
