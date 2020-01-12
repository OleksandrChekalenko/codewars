class LongestConsec {
    static String longestConsec(String[] strarr, int k) {
        if (k > strarr.length || k <= 0)
            return "";

        String longestStr = "";
        for (int index = 0; index < strarr.length - k + 1; index++) {
            StringBuilder sb = new StringBuilder();
            for (int i = index; i < index + k; i++) {
                sb.append(strarr[i]);
            }
            if (sb.toString().length() > longestStr.length()) {
                longestStr = sb.toString();
            }
        }
        return longestStr;
    }
}

//import java.util.*;
//
//class LongestConsec {
//
//    static String longestConsec(String[] strarr, int k) {
//        if (strarr.length < k || k <= 0) return "";
//        String[] orArr = strarr.clone();
//        List<String> list = Arrays.asList(strarr);
//        list.sort((o1, o2) -> o2.length() - o1.length());
//        Set<String> set = new LinkedHashSet<>(list);
//
//        list= new ArrayList<>(set);
//
//        List<String> orList = Arrays.asList(orArr);
//        String[] resArr = new String[strarr.length];
//
//        for (int i = 0; i < k; i++) {
//            resArr[orList.indexOf(list.get(i))] = list.get(i);
//        }
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < strarr.length; i++) {
//            if (resArr[i] != null)
//            result.append(resArr[i]);
//        }
//        return result.toString();
//
//    }
//}