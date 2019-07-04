public class StripComments {


    public static String stripComments(String text, String[] commentSymbols) {
        String cs = String.join("", commentSymbols);
        return text.replaceAll("\\h*[" + cs + "]+.*(\\n?)", "$1")
                .replaceAll("\\h+(\\n)", "$1")
                .replaceAll("\\h+\\z", "");
    }

    /*public static String stripComments(String text, String[] commentSymbols) {
        String[] t = text.split("\\n");
        int textLength = t.length;
        for (String s : commentSymbols)
            for (int i = 0; i < textLength; i++)
                if (t[i].contains(s))
                    t[i] = t[i].substring(0, t[i].indexOf(s)).trim();

        StringBuilder result = new StringBuilder();

        for (String s : t)
            result.append(s).append("\n");

        return result.toString().trim();
    }*/

}