import java.util.Arrays;

class Maps {
    static int[] map(int[] arr) {
        return Arrays.stream(arr).map(x -> x + x).toArray();
    }
}

/*
//Java 1.6
class Maps {
  static int[] map(int[] arr) {
    for (int i=0; i<arr.length;i++) {
      arr[i] = arr[i]*2;
    }
    return arr;
  }
}*/