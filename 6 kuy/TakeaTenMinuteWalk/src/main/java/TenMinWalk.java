public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length > 10 || walk.length < 10) return false;
        int n, w;
        n = w = 0;
        for (char wal : walk) {
            switch (wal) {
                case 'n':
                    n++;
                    break;
                case 's':
                    n--;
                    break;
                case 'w':
                    w++;
                    break;
                case 'e':
                    w--;
                    break;
            }
        }
        return n == 0 && w == 0;
    }
}