import java.util.Arrays;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                .filter(str -> Arrays.stream(array2).anyMatch(s -> s.contains(str)))
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }

    /*public static String[] inArray(String[] array1, String[] array2) {
        List<String> res = new ArrayList<String>();
        for (String s1 : array1) {
            for (String s2 : array2) {
                if (s2.contains(s1)) {
                    res.add(s1);
                    break;
                }
            }
        }
        Collections.sort(res);
        return res.toArray(new String[0]);
    }*/
}