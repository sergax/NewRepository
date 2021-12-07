package Task2;

/*
1. Цикл do сначала выполняет код цикла, а потом проверяет условие в инструкции while. И пока это условие истинно цикл повторяется,
в отличии от цикла while, который сразу проверяет истинность некоторого условия и если условие истинно, то код цикла выполняется.

2.Условные конструкции:

 - if/else
 if(num1>num2){
    System.out.println("");
}
else if(num1<num2){
    System.out.println("");
}
else{
    System.out.println("");
}

 - switch
 switch(num){

    case 1:
        System.out.println("");
        break;
    case 2:
        System.out.println("");
        break;

 - ternary operation
 int z = x<y? (x+y) : (x-y);
 */

import java.util.Arrays;
import java.util.Random;

public class JavaCycles {
    public static void main ( String[] args ) {

        int[] array = new int[10];
        Random random = new Random ( );

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt ( 10 );
            System.out.println ( array[i] );

        }

        System.out.println ( ); // indent from previous code

        int[] arrayWhile = new int[10];
        Random randomWhile = new Random ( );
        int j = 0;

        while (j < arrayWhile.length) {
            arrayWhile[j] = randomWhile.nextInt ( 10 );
            System.out.println ( arrayWhile[j] );
            j++;
        }

        System.out.println ( ); // indent from previous code

        int[] arrayEven = new int[10];
        Random random1 = new Random ( );

        for (int x = 1; x < arrayEven.length; x++) {
            if ( x % 2 == 0 ) {
                arrayEven[x] = random1.nextInt ( 10 );
                System.out.println ( arrayEven[x] );
            }
        }

        System.out.println ( ); // indent from previous code

        int[] arrayNotEven = new int[10];
        Random random2 = new Random ( );

        for (int k = 1; k < arrayNotEven.length; k++) {
            if ( k % 2 != 0 ) {
                arrayNotEven[k] = random2.nextInt ( 10 );
                System.out.println ( arrayNotEven[k] );
            }
        }

        System.out.println ( ); // indent from previous code

        Integer[] arrayWithNull = new Integer[6];
        Random random3 = new Random ( );

        for (int z = 0; z < arrayWithNull.length; z++) {
            if ( z < 4 && z % 2 != 0 ) {
                arrayWithNull[z] = random3.nextInt ( 10 );
            } else {
                arrayWithNull[z] = null;
            }
            System.out.println ( arrayWithNull[z] );

        }

        System.out.println ( ); // indent from previous code

        /*
        «Напишите программу, которая выводит на экран числа от 1 до 100.
        При этом вместо чисел, кратных трем, программа должна выводить слово Fizz, а вместо чисел, кратных пяти — слово Buzz.
        Если число кратно пятнадцати, то программа должна выводить слово FizzBuzz.
        Задача может показаться очевидной, но нужно получить наиболее простое и красивое решение.»
         */

        for (int v = 1; v < 100; v++) {
            if ( v % 15 == 0 ) {
                System.out.println ( "FizzBuzz" );
            } else if ( v % 3 == 0 ) {
                System.out.println ( "Fizz" );
            } else if ( v % 5 == 0 ) {
                System.out.println ( "Buzz" );
            } else {
                System.out.println ( v );
            }
        }

        System.out.println ( ); // indent from previous code

        /*
        You will be given a vector of strings. You must sort it alphabetically (case-sensitive, and based on the ASCII values of the chars)
        and then return the first value.The returned value must be a string, and have "***" between each of its letters.
         */

        class SortAndStar {
            public static String twoSort ( String[] s ) {
                Arrays.sort ( s );
                StringBuffer sb = new StringBuffer ( );

                int len = s[0].length ( );
                for (int i = 0; i < len; i++) {
                    sb.append ( s[0].charAt ( i ) );
                    if ( i < len - 1 ) sb.append ( "***" );
                }

                return sb.toString ( );
            }
        }

        System.out.println ( ); // indent from previous code

        int[] arrayBoolean = new int[10];
        Random randomBoolean = new Random ( );

        int b = 0;
        while (true) {
            if ( b < arrayBoolean.length ) {
                arrayBoolean[b] = randomBoolean.nextInt ( 10 );
                System.out.println ( arrayBoolean[b] );
                b++;
            } else {
                break;
            }
        }

        System.out.println ( ); // indent from previous code

        int[] arrayBoolean2 = new int[10];
        Random randomBoolean2 = new Random ( );

        for (int v = 0; true; v++) {
            if ( v < arrayBoolean2.length ) {
                arrayBoolean2[v] = randomBoolean2.nextInt ( 10 );
                System.out.println ( arrayBoolean2[v] );
            } else {
                break;
            }
        }
    }
}
