public class ASum {

    public static int findNb(long m) {
        int n = 0;
        do {
            m -= (long) Math.pow(n++ + 1, 3);
        } while (m > 0);
        return (m == 0) ? n : -1;
    }
}