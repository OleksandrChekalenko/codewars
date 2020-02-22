import java.util.List;

class SmileFaces {

    static int countSmileys(List<String> arr) {
        return (int)arr.stream().filter( x -> x.matches("[:;][-~]?[)D]")).count();
    }

    /*private static String regex = "[:;]+[-~]?+[)D]";
    private static int count;

    public static int countSmileys(List<String> arr) {
        count = 0;
        for (String s : arr) {
            if (s.matches(regex)) {
                count++;
            }
        }
        return count;
    }*/
}