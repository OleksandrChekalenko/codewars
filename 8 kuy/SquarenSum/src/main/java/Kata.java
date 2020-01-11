import java.util.Arrays;

class Kata {
    static int squareSum(int[] xs) {
        return Arrays.stream(xs).map(x -> x * x).sum();
    }
}

/*
//Java1.7
class Kata {
    static int squareSum(int[] n) {
        int result = 0;
        for (int i : n) {
         result += i*i;
        }
     return result;
    }
}*/
