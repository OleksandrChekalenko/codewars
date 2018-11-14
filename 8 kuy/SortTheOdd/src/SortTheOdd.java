class SortTheOdd {
    private int[] ints;

    public SortTheOdd() {
    }

    SortTheOdd(int[] ints) {
        this.ints = ints;
        sort();
    }


    int[] sort() {
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != 0 && ints[i] % 2 == 1) {
                count++;
            }
        }
        int[] oddInts = new int[count];
        count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != 0 && ints[i] % 2 == 1) {
                oddInts[count] = ints[i];
                ints[i] = 666;
                count++;
            }
            if (oddInts.length == count - 1)
                break;
        }
        oddInts = bubbleSort(oddInts);
        count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 666) {
                ints[i] = oddInts[count];
                count++;
            }
        }
        return ints;
    }

    public int[] bubbleSort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public int[] getInts() {
        return ints;
    }
}
