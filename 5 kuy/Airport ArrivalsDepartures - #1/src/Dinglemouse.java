import java.util.ArrayList;
import java.util.List;

/**
 * Created by Volio on 2017/2/15.
 * https://www.codewars.com/kata/airport-arrivals-slash-departures-number-1/train/java
 */
public class Dinglemouse {
    //    private static final String ALPHABET = Preloaded.ALPHABET;
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789";

    public static String[] flapDisplay(final String[] lines, final int[][] rotors) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < lines.length; i++) {
            char[] beforeChars = lines[i].toCharArray();
            int[] step = rotors[i];
            int tempStep = 0;
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < beforeChars.length; j++) {
                int beforeCharIndex = ALPHABET.indexOf(beforeChars[j]);
                int afterCharIndex = (beforeCharIndex + tempStep + step[j]) % ALPHABET.length();
                stringBuilder.append(ALPHABET.charAt(afterCharIndex));
                tempStep = (tempStep + step[j]) % ALPHABET.length();
            }
            result.add(stringBuilder.toString());
        }
        return result.toArray(new String[]{});
    }

    public static void main(String[] args) {
        String[] before = new String[]{"CODE"};
        int[][] rotors = new int[][]{{20, 20, 28, 0}};
        String[] after = flapDisplay(before, rotors);
        System.out.println(after[0]);
    }
}