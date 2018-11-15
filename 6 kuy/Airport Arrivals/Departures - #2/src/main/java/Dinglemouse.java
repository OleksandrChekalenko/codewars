import java.util.ArrayList;
import java.util.List;

public class Dinglemouse {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789";

    public static int[][] flapRotors(final String[] linesBefore, final String[] linesAfter) {

        return new int[][]{};
    }

    public static int[] convertIntegers(List<Integer> integers) {
        int[] array = new int[integers.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = integers.get(i);
        }
        return array;
    }

    public static void main(String[] args) {
        String[] before = new String[]{"CODE"};
        String[] rotors = new String[]{"WARS"};
        int[][] after = flapRotors(before, rotors);
        StringBuilder s = new StringBuilder("{");
        for (int[] a : after) {
            for (int b : a) {
                s.append(b).append(", ");
            }
            s.append("}");
            System.out.println(s.toString());
        }
    }
}
