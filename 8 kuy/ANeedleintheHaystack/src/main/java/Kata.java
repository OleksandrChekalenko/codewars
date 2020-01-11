import java.util.Arrays;

class Kata {
    static String findNeedle(Object[] haystack) {
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
    }
}

/*
//Java 1.7
class Kata {

    static String findNeedle(Object[] haystack) {
        String needle = "needle";
        for (int i = 0; i < haystack.length; i++) {
            if (String.valueOf(haystack[i]).equals(needle))
                return "found the needle at position " + i;
        }
        return "";
    }
}*/
