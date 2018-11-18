import java.lang.reflect.Array;
import java.util.Arrays;

public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("(?i)[aeiou]", "");
    }

    public static void main(String[] args) {
        System.out.println("N ffns bt, Yr wrtng s mng th wrst 'v vr rd");
        System.out.println((disemvowel("No offense but, Your writing is among the worst I've ever read")));
    }
}