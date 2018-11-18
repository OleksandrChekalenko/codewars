
public class Cleanup {
    public static String crap(char[][] x, int bag, int cap) {
        int capacity = cap;
        int dogCount = 0;
        int full = 0;
        for (char[] array : x) {
            for (char c : array) {
                if (c == 'D') dogCount++;
                if (bag == 0 && cap == 0) full++;
                if (c == '@' && bag != 0) {
                    if (cap == 0) {
                        bag--;
                        cap = capacity;
                    }
                    cap--;
                }
            }
        }
        return dogCount > 0 ? "Dog" : full > 0 ? "Cr@p" : "Clean";
    }

    public static void main(String[] args) {
        System.out.println(crap(new char[][]{{'_', '_', '_', '_'}, {'_', '_', '_', '@'}, {'_', '_', '@', '_'}}, 2, 2));
        System.out.println(crap(new char[][]{{'_', '_', '_', '_'}, {'_', '_', '_', '@'}, {'_', '_', '@', '_'}}, 1, 1));
        System.out.println(crap(new char[][]{{'_', '_'}, {'_', '@'}, {'D', '_'}}, 2, 2));
    }
}
