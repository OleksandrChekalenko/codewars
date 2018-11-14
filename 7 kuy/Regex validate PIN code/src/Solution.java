public class Solution {

    public static boolean validatePin(String pin) {
        int answer = 0;
        if (pin.length() == 4 || pin.length() == 6) {
            for (int i = 0; i < pin.length(); i++) {
                if (pin.charAt(i) < '0' || pin.charAt(i) > '9') {
                    answer++;
                }
            }
        } else answer++;
        return answer == 0;
    }

    public static boolean validatePin1(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }

    public static void main(String[] args) {
        System.out.println(validatePin1("1234"));
        System.out.println(validatePin1("123456"));
        System.out.println(validatePin1("12345"));
        System.out.println(validatePin1("-1234"));
        System.out.println(validatePin1("12b4"));
    }
}