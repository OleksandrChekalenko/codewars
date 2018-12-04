public class Order {
    public static String order(String words) {
        if (words.isEmpty()) return "";
        StringBuilder result = new StringBuilder();
        String[] tmp = words.split(" ");
        for (int i = 1; i < tmp.length + 1; i++) {
            for (String t : tmp) {
                if (t.contains(String.valueOf(i))) {
                    result.append(t).append(" ");
                    break;
                }
            }
        }
        return result.toString().trim();
    }

    /* public static String order(String words) {
    return Arrays.stream(words.split(" "))
      .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
      .reduce((a, b) -> a + " " + b).get();
  }*/
}