public class Test {
    public static void main(String[] args) {
        /*true*/System.out.println(assertEquals(new int[]{1, 3, 2, 8, 5, 4}, new SortTheOdd(new int[]{5, 3, 2, 8, 1, 4})));
        /*false*/System.out.println(assertEquals(new int[]{1, 1, 3, 2, 8, 5, 4}, new SortTheOdd(new int[]{5, 3, 2, 8, 1, 4})));
        /*true*/System.out.println(assertEquals(new int[]{1, 3, 2, 8, 5, 4}, new SortTheOdd(new int[]{5, 3, 2, 8, 1, 4})));
        /*false*/System.out.println(assertEquals(new int[]{1, 3, 2, 8, 5, 4}, new SortTheOdd(new int[]{5, 3, 10, 8, 1, 4})));
        /*true*/System.out.println(assertEquals(new int[]{20, 1, 3, 2, 8, 5, 4, 33}, new SortTheOdd(new int[]{20, 5, 3, 2, 8, 1, 4, 33})));
    }

    private static boolean assertEquals(int[] ints, SortTheOdd sortTheOdd) {
        for (int i = 0; i < ints.length; i++) {
            if (ints.length != sortTheOdd.getInts().length)
                return false;
            if (ints[i] == sortTheOdd.getInts()[i]) {
            } else return false;
        }
        return true;
    }
}
