package playtica;

import java.util.Arrays;

public class Task {
    /*
Given a string of numbers where there is an intruder.
Example1: in the string 1, 7, -5, 3, -3, -1, 5 number 7 is an intruder because it has no ‘pair’
Example 2: in the string 6, 1, 7, 8, -6, -7, 3, -8, -1 number 3 is an intruder.

Write a method (code, pseudocode, steps) by which, giving a certain string of numbers, to display the intruder.
     */
    void findIntruder(String s) {
        String[] s1 = s.split(" ");
        Arrays.stream(s1).sorted();
        System.out.println();
    }

    /*
Write a method (code, pseudocode, steps) that, receiving an integer, displays the sum of the digits on the even positions of the number.
The numbering of the digit positions is done from left to right, starting with position 0.
Ex.1: n = 1234, sum => 1 + 3 = 4
Ex.2: n = 63990, sum => 6 +9 +0 = 15.
     */
    void method(int i) {
        int acum = 0;
        int temp = i;
        while (temp != 0) {
            acum += temp % 10;
            temp /= 10;
        }
        System.out.println(acum);
    }

    public static void main(String[] args) {
        Task task = new Task();
        task.findIntruder("1,5,-1,2,2,4,4");
        task.method(1234);
    }
}
