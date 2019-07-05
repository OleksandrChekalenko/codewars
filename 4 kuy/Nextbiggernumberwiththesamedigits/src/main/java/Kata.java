import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kata {
    public static long nextBiggerNumber(long n) {
        String[] stringArr = String.valueOf(n).split("");

        int[] arr = new int[stringArr.length];
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        for (String s : stringArr) {
            list.add(Integer.parseInt(s));
        }
       Collections.sort(list);
        Collections.reverse(list);

        String res = String.valueOf(arr);
        return n;
    }
}