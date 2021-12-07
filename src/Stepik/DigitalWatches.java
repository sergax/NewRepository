package Stepik;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
Digital watches
Digital watches display time in the h:mm:ss format (from 0:00:00 to 23:59:59),
i.e. first goes the number of hours, then goes the two-digit number of minutes,
followed by the two-digit number of seconds. If necessary, number of minutes and
seconds are filled by zeroes to a two-digit number.
N seconds passed from the beginning of the day. Output what the watches will display.
Input data format
Given the natural number N on input, not exceeding 107 10^7 107 (10000000).

Notice that formatting means converting date to string and parsing means converting string to date.
 */
public class DigitalWatches {
    private String result;
    private long input;

    void displayTime() {
        Scanner sc = new Scanner(System.in);
        input = sc.nextLong() * 1000;
        Date date = new Date(input);
        SimpleDateFormat format = new SimpleDateFormat("H:mm:ss");
        result = format.format(date);
        System.out.println(result);
    }
}
