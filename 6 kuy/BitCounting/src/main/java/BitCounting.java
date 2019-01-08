public class BitCounting {

    public static int countBits(int n) {
        /*int count = 0;
        for (char c : Integer.toBinaryString(n).toCharArray()) {
            count += c == '1' ? 1 : 0;
        }
        return count;*/
        return Integer.bitCount(n);
    }


    public static void main(String[] args) {
        System.out.println("5 == " + countBits(1234));
        System.out.println("1 == " + countBits(4));
        System.out.println("3 == " + countBits(7));
        System.out.println("2 == " + countBits(9));
        System.out.println("2 == " + countBits(10));
    }
}
