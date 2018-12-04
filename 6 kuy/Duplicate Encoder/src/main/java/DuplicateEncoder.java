public class DuplicateEncoder {
	static String encode(String word){
	    final String ALPHABET ="abcdefgjhklmopqrstuxwyz";
        String duplicates = "";
        for (char c : word.toLowerCase().toCharArray()) {
            for (char c2 : ALPHABET.toCharArray()) {
                if (c == c2) {

                }
            }
        }
    return word;
  }
}
