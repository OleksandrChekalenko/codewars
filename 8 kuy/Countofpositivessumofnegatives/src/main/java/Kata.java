class Kata {

    static int[] countPositivesSumNegatives(int[] input) {
        if (input == null ||input.length == 0) {
            return new int[]{};
        }

        int pos = 0;
        int neg = 0;

        for (int i : input) {
            if (i > 0) {
                pos++;
            } else {
                neg += i;
            }
        }
        return new int[]{pos, neg};
    }
}