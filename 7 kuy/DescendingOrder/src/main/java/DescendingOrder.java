import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
//       List<Integer> list=  Stream.of((String.valueOf(num).toCharArray())).map((s) -> Integer.parseInt(Arrays.toString(s))).sorted(Integer::compareTo).collect(Collectors.toList());
        char[] chars = String.valueOf(num).toCharArray();
        Arrays.sort(chars);
        return Integer.valueOf((new StringBuilder(String.valueOf(chars)).reverse()).toString());
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(123456789));
    }
}