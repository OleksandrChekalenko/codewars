import java.util.stream.Collectors;

class DuplicateEncoder {
    static String encode(String word){
        return word.toLowerCase()
                .chars()
                .mapToObj(i -> String.valueOf((char)i))
                .map(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" : ")")
                .collect(Collectors.joining());
    }
}

/*class DuplicateEncoder {
    static String encode(String word){
        word = word.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result.append(word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")");
        }
        return result.toString();
    }
}*/

/*import java.util.ArrayList;
import java.util.List;

class DuplicateEncoder {
    private static String[] chars;

	static String encode(String word){
        chars = word.toLowerCase().split("");

        return getModifiedString().toString();
  }

    private static StringBuilder getModifiedString() {
        List<String> strChars = getListWithDup();
        StringBuilder result = new StringBuilder();
        for (String aChar : chars) {
            if (strChars.contains(aChar)) {
                result.append(")");
            } else result.append("(");
        }
        return result;
    }

    private static List<String> getListWithDup() {
        List<String> strChars = new ArrayList<String>();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i+1; j <chars.length; j++) {
                if (chars[i].equals(chars[j])) {
                    if (!strChars.contains(chars[i])) {
                        strChars.add(chars[i]);
                    }
                }
            }
        }
        return strChars;
    }
}*/