import java.util.Arrays;

public class Solution {

    public static String alphaSeq(String s) {
        StringBuilder result = new StringBuilder();
        char[] charArray = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charArray[i] = Character.toLowerCase(s.charAt(i));
        }
        Arrays.sort(charArray);
        int tmp;
        int fromLowCase = 96;
        char res;
        for (char c : charArray) {
            tmp = (int) c;
            if (tmp <= 122 && tmp >= 97) {
                res = (char) tmp;
                tmp -= fromLowCase;
                for (int i = 0; i < tmp; i++) {

                    result.append(i == 0 ? Character.toUpperCase(res) : res);
                }
                result.append(",");
            }
        }
        return result.deleteCharAt(result.toString().length() - 1).toString();
    }
}
