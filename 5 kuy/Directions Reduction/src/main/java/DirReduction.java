import java.util.ArrayList;
import java.util.List;

public class DirReduction {

    public static String[] dirReduc(String[] arr) {
        List<String> unique = new ArrayList<>();

        for (String s : arr) {
            if (unique.isEmpty() || !isOpposite(unique.get(unique.size() - 1), s)) {
                unique.add(s);
            } else {
                unique.remove(unique.size() - 1);
            }
        }

        return unique.toArray(new String[unique.size()]);
    }

    private static boolean isOpposite(String a, String b) {
        return (a.equals("WEST") && b.equals("EAST")) ||
                (a.equals("EAST") && b.equals("WEST")) ||
                (a.equals("SOUTH") && b.equals("NORTH")) ||
                (a.equals("NORTH") && b.equals("SOUTH"));
    }
}