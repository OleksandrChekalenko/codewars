

public class TestOdd {
    public static void main(String[] args) {
        System.out.println(assertEquals(5, FindOdd.findIt(new int[]{0, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5})));
        System.out.println(assertEquals(-1, FindOdd.findIt(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5})));
        System.out.println(assertEquals(5, FindOdd.findIt(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5})));
        System.out.println(assertEquals(10, FindOdd.findIt(new int[]{10})));
        System.out.println(assertEquals(10, FindOdd.findIt(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1})));
        System.out.println(assertEquals(1, FindOdd.findIt(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10})));
    }

    public static boolean assertEquals(int i, int j) {
        return i == j;
    }


}
