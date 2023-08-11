package org.example;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {

    public static String toRoman(int n) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (n >= values[i]) {
                n = n - values[i];
                roman.append(romanLetters[i]);
            }
        }
        return roman.toString();
    }

    public static int fromRoman(String romanNumeral) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        romanNumeral = romanNumeral.replace("IV", "IIII");
        romanNumeral = romanNumeral.replace("IX", "VIIII");
        romanNumeral = romanNumeral.replace("XL", "XXXX");
        romanNumeral = romanNumeral.replace("XC", "LXXXX");
        romanNumeral = romanNumeral.replace("CD", "CCCC");
        romanNumeral = romanNumeral.replace("CM", "DCCCC");
        int number = 0;
        for (int i = 0; i < romanNumeral.length(); i++) {
            number = number + (map.get(romanNumeral.charAt(i)));
        }
        return number;
    }
}