package Сodewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class CodeFromСodewars {
    /*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.
     */
    public static int romanToInt(String s) {
        int sum = 0;
        HashMap<Character, Integer> mapRoman = new HashMap<>();
        mapRoman.put('I', 1);
        mapRoman.put('V', 5);
        mapRoman.put('X', 10);
        mapRoman.put('L', 50);
        mapRoman.put('C', 100);
        mapRoman.put('D', 500);
        mapRoman.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            sum += mapRoman.get(c);
            if (mapRoman.get(s.charAt(i)) < mapRoman.get(s.charAt(i + 1)))
                sum -= mapRoman.get(c) * 2;
        }
            sum += mapRoman.get(s.charAt(s.length() - 1));
        return sum;
    }

    /*
    In this Kata your task will be to return the count of pairs that have consecutive numbers as follows:
    pairs([1,2,5,8,-4,-3,7,6,5]) = 3
    The pairs are selected as follows [(1,2),(5,8),(-4,-3),(7,6),5]
    --the first pair is (1,2) and the numbers in the pair are consecutive; Count = 1
    --the second pair is (5,8) and are not consecutive
    --the third pair is (-4,-3), consecutive. Count = 2
    --the fourth pair is (7,6), also consecutive. Count = 3.
    --the last digit has no pair, so we ignore.
     */
    public static String solve(int[] arr) {
        //..
        Random randomInd = new Random();
        for (int i = 0; i < arr.length - 1 ; i++) {
           int ran = randomInd.nextInt(i + 1);
           int a = arr[ran];
           arr[ran] = arr[i];
           arr[i] = a;
        }

        return Arrays.toString(arr);
    }

    /*
    Your task in order to complete this Kata is to write a function which formats a duration,
    given as a number of seconds, in a human-friendly way.
    The function must accept a non-negative integer. If it is zero, it just returns "now".
    Otherwise, the duration is expressed as a combination of years, days, hours, minutes and seconds.
     */
    public static class TimeFormatter {
        private static String result = "";
        private static final int[] UNITS = new int[]{31536000, 86400, 3600, 60, 1};
        private static final String[] LABELS = new String[]{"year", "day", "hour", "minute", "second"};

        public static String formatDuration(int seconds) {
            if (seconds == 0) return "now";

            for (int i = 0; i < 5; i++) {
                if (seconds >= UNITS[i]) {
                    int divider = seconds / UNITS[i];
                    seconds = seconds % UNITS[i];
                    result += (result.equals("") ? "" : (seconds == 0 ? " and " : ", "))
                            + divider + " " + LABELS[i] + (divider > 1 ? "s" : "");
                }
            }
            return result;
        }
    }

    public static int squareDigits(int n) {
        StringBuilder result = new StringBuilder();
        String s = String.valueOf(n);
        char[] ch = s.toCharArray();
        for (char chNum : ch) {
            int pow = (int) Math.pow(Integer.parseInt(String.valueOf(chNum)), 2);
            result.append(pow);
        }
        return Integer.parseInt(result.toString());
    }

    public class TriangleTester {
        public static boolean isTriangle(int a, int b, int c) {
            return Math.addExact(a, b) > c && Math.addExact(a, c) > b && Math.addExact(b, c) > a;
        }
    }

    public class StringUtils {
        public static String toAlternativeString(String string) {
            String result = "";
            for (char c : string.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    result += Character.toLowerCase(c);
                } else {
                    result += Character.toUpperCase(c);
                }
            }
            return result;
        }
    }

    public class ReverseWords {

        public static String reverseWords(String str) {
            String string = " ";
            String[] arrayWords = str.split(" ");
            String reverseWords = "";

            for (int i = arrayWords.length - 1; i >= 0; i--) {
                if (i != 0) {
                    reverseWords += arrayWords[i] + " ";
                } else {
                    reverseWords += arrayWords[i];
                }
            }

            return reverseWords;
        }
    }


    public class Kata {
        public static String highAndLow(String numbers) {
            String[] highAndLow = numbers.split(" ");
            String maxValue = highAndLow[0];
            String minValue = highAndLow[0];

            for (int i = 0; i < highAndLow.length; i++) {
                if (Integer.parseInt(maxValue) <= Integer.parseInt(highAndLow[i])) {
                    maxValue = highAndLow[i];

                } else if (Integer.parseInt(minValue) >= Integer.parseInt(highAndLow[i])) {
                    minValue = highAndLow[i];
                }
            }
            return (maxValue + " " + minValue);
        }
    }

    class Test {
        /*
    accum("abcd") -> "A-Bb-Ccc-Dddd"
    accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
    accum("cwAt") -> "C-Ww-Aaa-Tttt"
         */
        public static String accum(String s) {
            s = s.toLowerCase();
            StringBuilder builder = new StringBuilder();
            char letter;

            for (int i = 0; i < s.length(); i++) {
                letter = s.charAt(i);
                for (int j = 0; j < i + 1; j++) {
                    if (j == 0) {
                        builder.append(Character.toUpperCase(letter));
                    } else {
                        builder.append(letter);
                    }
                }
                if (i != s.length() - 1) {
                    builder.append('-');
                }
            }
            return builder.toString();
        }
    }

    class BinaryArrayToNumber {
        /*
        Testing: [0, 0, 0, 1] ==> 1
        Testing: [0, 0, 1, 0] ==> 2
        Testing: [0, 1, 0, 1] ==> 5
         */
        public static int ConvertBinaryArrayToInt(List<Integer> binary) {
            int value = 0;
            for (int i = 0; i < binary.size(); i++) {
                int value2 = (binary.size() - 1) - i;
                if (binary.get(i) == 1) {
                    value = value + ((Double) Math.pow((double) 2, (double) value2)).intValue();
                }
            }
            return value;
        }

        public static void main(String[] args) {
        }
    }

    public class ThinkingAndTesting {

        public static int testAB(int a, int b) {

            return a | b;
        }
    }
}

