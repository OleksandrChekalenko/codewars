class Divisible {
    static boolean isDivisible(int... arr) {
        if (arr.length < 2) {
            return false;
        }
        int divided = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 0 && divided % arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}

/*import java.util.Arrays;

public class Divisible {
    public static boolean isDivisible(final int... arr) {
        return arr.length < 2 || Arrays.stream(arr).skip(1).allMatch(i -> i != 0 && arr[0] % i == 0);
    }
}*/