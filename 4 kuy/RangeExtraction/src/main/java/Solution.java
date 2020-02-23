class Solution {

    private static int[] arr;
    private static int i;

    static String rangeExtraction(int[] arr) {
        StringBuilder res = new StringBuilder();
        Solution.arr = arr;

        for (i = 0; i < arr.length; i++) {
            if (isNextExist() && isEquals()) {
                res.append(arr[i]);
                i++;
                if (isNextExist() && isEquals()) {
                    res.append("-");
                    i++;
                    while (isNextExist() && isEquals()) {
                        i++;
                    }
                    res.append(arr[i]);
                } else {
                    res.append(",").append(arr[i]);
                }
                res.append(",");
            } else res.append(arr[i]).append(",");
        }
        return res.deleteCharAt(res.toString().length() - 1).toString();
    }

    private static boolean isEquals() {
        return Solution.arr[Solution.i] + 1 == arr[Solution.i + 1];
    }

    private static boolean isNextExist() {
        return Solution.i + 1 < Solution.arr.length;
    }
}