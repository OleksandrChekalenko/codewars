class GrassHopper {
    static int summation(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}

/*public class GrassHopper {
    public static int summation(int n) {
      return (n * (n+1)) >> 1;
    }
}*/