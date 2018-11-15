import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static String alphabetWar(String fight) {
        int left = 0;
        int right = 0;

        for (char c : fight.toCharArray()) {
            switch (c) {
                case 'w': left += 4; break;
                case 'p': left += 3; break;
                case 'b': left += 2; break;
                case 's': left += 1; break;
                case 'm': right += 4; break;
                case 'q': right += 3; break;
                case 'd': right += 2; break;
                case 'z': right += 1; break;
            }
        }
        return right == left ? "Let's fight again!" : right > left ? "Right side wins!" : "Left side wins!";
    }

    public static void main(String[] args) {
        System.out.println(alphabetWar("z"));
        System.out.println(alphabetWar("zdqmwpbs"));
        System.out.println(alphabetWar("wwwwwwz"));
    }
}
