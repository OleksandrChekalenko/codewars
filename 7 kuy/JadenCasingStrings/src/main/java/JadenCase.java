import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty())
            return null;
        return Arrays.stream(phrase.split(" "))
                .map((s -> s.substring(0, 1).toUpperCase() + s.substring(1, s.length())))
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(toJadenCase("most trees are blue"));
    }
}
