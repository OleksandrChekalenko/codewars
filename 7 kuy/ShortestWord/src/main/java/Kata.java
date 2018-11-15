import java.util.Arrays;

public class Kata {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
        System.out.println(findShort("turns out random test cases are easier than writing out basic onesw"));
    }
}