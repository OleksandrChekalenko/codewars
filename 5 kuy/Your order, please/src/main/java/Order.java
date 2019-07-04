public class Order {

    public static String order(String words) {
        String[] arr = words.split(" ");
        StringBuilder result = new StringBuilder("");
        for (int i = 1; i <= arr.length; i++) {
            for (String s : arr) {
                if (s.contains(String.valueOf(i))) {
                    result.append(s + " ");
                }
            }
        }
        return result.toString().trim();
    }

    /*public static String order(String words) {
        if (words.equals("")) {
            return "";
        }
        String[] arr = words.split(" ");
        String result = "";
        String[] res = new String[arr.length];
        boolean worked = false;

        for (String s : arr) {
            for (int i = 1; i <= arr.length; i++) {
                for (String str : s.split("")) {
                    if (str.equals("" + i)) {
                        res[i - 1] = s;
                        worked = true;
                        break;
                    }
                }
                if (worked) {
                    worked = false;
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            result += res[i] + " ";
        }
        return result.trim();
    }*/

    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a").equals("Thi1s is2 3a T4est"));
    }
}