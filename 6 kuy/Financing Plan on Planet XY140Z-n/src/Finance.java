import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.stream.IntStream;

public class Finance {

    public static BigInteger finance(int n) {
        Double i = IntStream.range(0, n + 1).mapToDouble(x -> ((3 * x + 3 * Math.pow(x, 2)) / 2)).reduce(0, (x, y) -> x + y);
        return BigDecimal.valueOf(i).toBigInteger();
    }

        public static void main(String[] args) {
        System.out.println(finance(6).toString());
    }
}
