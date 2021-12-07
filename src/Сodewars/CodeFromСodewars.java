package Сodewars;

import java.util.List;

public class CodeFromСodewars {
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
