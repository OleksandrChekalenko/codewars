class Line {

    static String WhoIsNext(String[] names, int n) {
        while (n > names.length) {
            n = (n - (names.length - 1)) / 2;
        }
        return names[n - 1];
    }
}

/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Line {
    private static int n = 0;
    public static String WhoIsNext(String[] names, int ch) {
        n = ch;
        List<String> list = new ArrayList<String>(Arrays.asList(names));
        for (int i = 0; i <= ch/names.length; i++) {
            list = getArr(list);
        }
        return list.get(0);
    }

    private static List<String> getArr(List<String> list) {
        for (int i = 0; i < list.size(); i+=2) {
            list.add(i , list.get(i));
            n--;
            if (n == 0) {
                String[] a = new String[]{list.get(i)};
                return new ArrayList<String>(Arrays.asList(a));
            }
        }
        return list;
    }
}*/


