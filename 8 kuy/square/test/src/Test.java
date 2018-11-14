import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> testValues = new ArrayList<>();
        testValues.add(0, null);
        testValues.add(1, 1);
        testValues.add(2, 2);
        testValues.add(3, 100);
        testValues.add(4, 50);

        for (Integer i : testValues) {
            System.out.println(i);
        }

        Optional<Integer> maxValue = testValues.stream().filter(Objects::nonNull).max(Integer::compareTo);
        System.out.println("MaxValue=" + maxValue);
        Optional<Integer> minValue = testValues.stream().filter(p -> p != null).min(Integer::compareTo);
        System.out.println("MinValue=" + minValue);
    }
}
