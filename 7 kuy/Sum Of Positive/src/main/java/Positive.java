import java.util.LinkedList;
import java.util.List;

public class Positive {
    public static int sum(int[] arr){
        if (arr.length == 0) {
            return 0;
        }
        List<Integer> arrList = new LinkedList<Integer>();
        for (int i : arr) {
            if (i > 0)
                arrList.add(i);
        }
        if (arrList.isEmpty())
            return 0;
        int result = 0;
        for (Integer i : arrList) {
            result += i;
        }
        return result;
    }

}
