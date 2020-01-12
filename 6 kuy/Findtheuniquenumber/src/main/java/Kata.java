import java.util.Arrays;

class Kata {
    static double findUniq(double[] arr) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];

    }
}

/*
class Kata {
    static double findUniq(double arr[]) {
        double dup = arr[0] == arr[1] ? arr[0] : arr[2];
        for (double d : arr) {
            if (d != dup) {
                return d;
            }
        }
        return arr[0];
    }
}*/
