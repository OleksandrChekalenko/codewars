public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        StringBuilder result = new StringBuilder();
        for (String word : morseCode.split("  +")) {
            for (String chars : word.split(" ")) {
                result.append(chars);
            }
            result.append(" ");
        }
        return result.toString().trim();
    }

   /* public static final String WORD_DELIMITER = "   ";
    public static final String CHAR_DELIMITER = " ";

    public static String decode(String morseCode) {
        return Arrays.stream(morseCode.trim().split(WORD_DELIMITER))
                .map(MorseCodeDecoder::decodeWord)
                .collect(Collectors.joining(" "));
    }

    private static String decodeWord(String morseWord) {
        return Arrays.stream(morseWord.trim().split(CHAR_DELIMITER))
                .map(MorseCode::get)
                .collect(Collectors.joining());
    }*/
}