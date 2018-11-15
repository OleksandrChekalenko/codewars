public class Accumul {

    public static String accum(String s) {
        String result = "";
        int count = 0, first = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            for (int i = 0; i <= count; i++) {
                result += first == 0 ? String.valueOf(c).toUpperCase() : String.valueOf(c);
                first++;
            }
            first = 0;
            count++;
            result += "-";
        }
        return result.substring(0, result.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(accum("abcd"));
        System.out.println(accum("RqaEzty"));
        System.out.println(accum("cwAt"));
    }
}