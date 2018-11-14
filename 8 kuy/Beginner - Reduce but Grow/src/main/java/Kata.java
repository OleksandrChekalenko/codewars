import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {

    public static void main(String[] args) {
        System.out.println(grow(new int[]{4, 1, 1, 1, 4}));
    }

    public static int grow(int[] x) {

// /*можна і так*/       return IntStream.of(x).reduce(1, (s1, s2) -> s1 * s2);
        return (Arrays.stream(x).boxed().collect(Collectors.toList()).stream().reduce((s1, s2) -> s1 * s2)).get();
    }

}
