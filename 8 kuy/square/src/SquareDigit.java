public class SquareDigit {

    public static long digPow(int n, int p) {
        int[] array = Integer.toString(n).chars().map(c -> c-'0').toArray();
        int temp = 0;
        for (int arr : array) {
            temp += Math.pow(arr, p);
            p++;
        }
         return temp % n == 0 ? temp / n : -1;
    }

    public static void main(String[] args) {
        System.out.println(digPow(89, 1));
        System.out.println(digPow(92, 1));
        System.out.println(digPow(695, 2));
        System.out.println(digPow(46288, 3));
    }
}