class Maskify {

    static String maskify(String str) {
        if (str == null || str.equals("")) return "";
        if (str.length() < 5) return str;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length - 4; i++) {
            chars[i] = '#';
        }
        StringBuilder res = new StringBuilder();
        for (char c : chars) {
            res.append(c);
        }
        return res.toString();
    }
}
