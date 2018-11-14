class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int count = 1;
        int result = 0;
        for (int i = count; i < n + 1; i++) {
            count += i;
        }
        count = (count * 2) - 1;

        for (int i = 1; i < n + 1; i++) {
            count -= 2;
            result += count;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(1));
        System.out.println(rowSumOddNumbers(42));
    }
}
