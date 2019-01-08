import java.util.Arrays;

public class FindOutlier {
    static int find(int[] integers) {
        StringBuilder stringBuilder = new StringBuilder("Worlt");
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        int num = 0;
        for (int i = 0; i < 3; i++) {
            num += integers[i] % 2 == 0 ? 1 : -1;
        }
        if (num < 0)
            return Arrays.stream(integers).filter((n) -> n % 2 == 0).findAny().orElse(0);
        else
            return Arrays.stream(integers).filter((n) -> n % 2 != 0).findAny().orElse(0);
    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{2, 6, 8, -10, 3}));
        System.out.println(find(new int[]{206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}));
    }
}