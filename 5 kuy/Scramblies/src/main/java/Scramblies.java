public class Scramblies {

    public static boolean scramble(String str1, String str2) {

        for (String let : str2.split("")) {
            if (str1.contains(let))
                str1 = str1.replaceFirst(let, "");
            else return false;
        }
        return true;
    }
}

/*
public class Scramblies {

    public static boolean scramble(String str1, String str2) {

        if (str1.length() < str2.length()) return false;

        String[] str2Arr = str2.split("");
        String str1Copy = "" + str1;

        for (int i = 0; i < str2.length(); i++) {
            String[] str1Arr = str1Copy.split("");
            for (int j = 0; j < str1Copy.length(); j++) {
                if (str2Arr[i].equals(str1Arr[j])) {
                    str1Copy = str1Copy.replaceFirst(str1Arr[j], "");
                    break;
                }
            }
        }
        return str2.length() == str1.length() - str1Copy.length();
    }
}*/
