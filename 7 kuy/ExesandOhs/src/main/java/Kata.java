
public class Kata {

    public static boolean exesAndOhs(String string) {
        int result = 0;
        for (char c : string.toCharArray()) {
            result += c == 'x' || c == 'X' ? 1 : c == 'o' || c == 'O' ? -1 : 0;
        }
        return result == 0;
    }

    public static void main(String[] args) {
        System.out.println(exesAndOhs("ooxx"));
        System.out.println(exesAndOhs("xooxx"));
        System.out.println(exesAndOhs("ooxXm"));
        System.out.println(exesAndOhs("zpzpzpp"));
        System.out.println(exesAndOhs("zzoo"));
    }
}
