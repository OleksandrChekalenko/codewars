package org.example;

public class Kata {

  public static String add(String a, String b) {
    if (a.isBlank() && b.isBlank())
      return "";
    if (a.isBlank()) {
      return b;
    }
    if (b.isBlank()) {
      return a;
    }

    int[] aArray = getArray(a);
    int[] bArray = getArray(b);

    int arrayMin = Math.min(aArray.length, bArray.length);
    int[] workingArray = aArray.length > bArray.length ? aArray : bArray;

    for (int i = 0; i < arrayMin; i++) {
      int sum = aArray[i] + bArray[i];
      workingArray[i] = sum % 10;
      if (sum > 9) {
        workingArray[i + 1] = workingArray[i + 1] + 1;
      }
    }

    StringBuilder result = new StringBuilder();
    int prev = 0;
    for (int i = workingArray.length - 1; i >= 0; i--) {
      if (prev == 0 && workingArray[i] == 0) {
        prev = workingArray[i];
      } else {
        if (prev == 0) {
          prev = -1;
        }
        result.append(workingArray[i]);
      }
    }
    return result.toString();
  }

  private static int[] getArray(String a) {
    String[] aSplit = a.split("");
    int[] aArray = new int[aSplit.length + 1];
    for (int i = 0; i < aSplit.length; i++) {
      aArray[i] = Integer.parseInt(aSplit[aSplit.length - 1 - i]);
    }
    return aArray;
  }
}