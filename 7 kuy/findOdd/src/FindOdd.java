import java.util.HashSet;
import java.util.TreeSet;

public class FindOdd {
    public static int findIt(int[] arr) {
/*        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count % 2 != 0)
                return arr[i];
        }
        return -1;*/
        /*int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
        return xor;*/
        TreeSet<Integer> set = new TreeSet<>();

        for (int i : arr) {
            if (set.contains(i))
                set.remove(i);
             else
                set.add(i);
        }
        return set.first();
    }
}
