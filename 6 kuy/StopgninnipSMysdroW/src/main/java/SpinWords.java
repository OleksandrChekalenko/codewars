import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {

    private StringBuilder result = new StringBuilder();
    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(new SpinWords().spinWords("Welcome"));
    }
}