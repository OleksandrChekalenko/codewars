public class Kata {
    public static int findEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int left = 0, right = 0;
            for (int j = 0; j < i; j++) {
                left += arr[j];
            }
            for (int j = i + 1; j < arr.length; j++) {
                right += arr[j];
            }
            if (left - right == 0) return i;
        }
        return -1;
    }
}