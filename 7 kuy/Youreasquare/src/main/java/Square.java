public class Square {
    public static boolean isSquare(int n) {
        return Math.sqrt(n) == (int)Math.sqrt(n); // fix me!
    }

    public static void main(String[] args) {
        System.out.println(isSquare(4));
        System.out.println(isSquare(3));
        System.out.println(isSquare(0));
        System.out.println(isSquare(-1));
        System.out.println(isSquare(238185554));
    }
}