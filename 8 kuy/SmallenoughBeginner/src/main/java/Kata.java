import java.util.Arrays;

public class Kata {
    public static String pak(final String s) {
        /*if (s == null || s.trim().length() == 0)
        return "";
        StringBuilder tmp = new StringBuilder();
        String[] array = s.split(" ");
        for (int i = 1; i < array.length - 1; i++) {
            tmp.append(" ").append("pak").append(" ").append(array[i]);

        }
        String result = array[0] + tmp.toString() + " pak " + array[array.length - 1];
        return result;*/
        return String.join(" pak ", s.split(" "));
    }

    public static void main(String[] args) {
        System.out.println(pak("Man I need a taxi up to Ubud"));
        System.out.println(pak("What time are we climbing up the volcano?"));
        System.out.println("     ");

    }
}
