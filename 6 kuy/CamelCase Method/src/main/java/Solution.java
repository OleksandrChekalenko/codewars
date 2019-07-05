public class Solution {

    public static String camelCase(String str) {
        if (str.isEmpty()) return "";
        str = str.replaceAll(" +", " ").trim();
        StringBuilder res = new StringBuilder();
        for (String s : str.split(" ")) {
            if (!s.isEmpty())
            res.append(s.substring(0, 1).toUpperCase()).append(s.substring(1).toLowerCase());
        }
        return res.toString();
    }

}