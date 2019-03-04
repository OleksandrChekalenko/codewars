public class PigLatin {
    public static String pigIt(String str) {
        /*String[] punctuation = "?!,./;:'\"|\\`~".split("");
        StringBuilder result = new StringBuilder();
        boolean regex = false;
        for (String word : str.trim().split(" ")) {
            if (word.length() == 1) {
            for (String pun : punctuation) {
                if (word.contains(pun)) regex = true;
            }}
            if (!regex) {
                result.append(word.substring(1, word.length()) + word.charAt(0) + "ay" + " ");
            } else {
                result.append(word).append(" ");
                regex = false;
            }
        }
        return result.toString().trim();*/
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }

    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
        System.out.println(pigIt("Hello world !"));
        System.out.println(pigIt("Quis custodiet ipsos custodes ?"));
    }
}