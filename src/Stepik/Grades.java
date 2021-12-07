package Stepik;

import java.util.Scanner;

/*
Find the number of "Ds", "Cs", "Bs" and "As" for the last test on informatics
in the class consisting of n students. The program gets number n as input,
and then gets the grades themselves (one by one). The program should output
four numbers in a single line - the number of "D", the number of "C", the number
of "B" and the number of "A" grades.
 */
public class Grades {
    void findTheNumber() {
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        int[] arrayOfGrade = new int[4];

        for(int i = 0; i < arrayOfGrade.length;i++){
            int input = scanner.nextInt();
            arrayOfGrade[input - 2]++;
        }
        for (int arr : arrayOfGrade
             ) {
            System.out.println(arr + " ");
        }
    }
}
