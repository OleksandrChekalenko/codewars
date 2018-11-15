public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        for (char c : str.toCharArray()) {
            vowelsCount += (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;
        }
        return vowelsCount;
    }

    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
    }
}
