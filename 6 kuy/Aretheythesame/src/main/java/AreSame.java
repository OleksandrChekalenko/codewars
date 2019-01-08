import java.util.Arrays;

class AreSame {

    static boolean comp(int[] a, int[] b) {

        if (a == null || b == null || a.length != b.length) return false;

        int arrayLength = a.length;

        for (int i = 0; i < arrayLength; i++)
            a[i] = a[i] * a[i];

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < arrayLength; i++) {
            if (a[i] != b[i])
                return false;
        }


        return true;
    }
}
/*
return a != null && b != null && a.length == b.length && Arrays.equals(Arrays.stream(a).map(i -> i * i).sorted().toArray(), Arrays.stream(b).sorted().toArray());
}*/
