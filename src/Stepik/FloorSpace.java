package Stepik;
/*
Residents of the Malevia country often experiment with the plan of their rooms.
Rooms can be triangular, rectangular and round. To quickly calculate the floorage
it is required to write a program, which gets the type of the room shape and the
relevant parameters as input - the program should output the area of the resulting room.
The value of 3.14 is used instead of the number π in Malevia.
 */
import java.util.Scanner;

public class FloorSpace {
    private static final double P = 3.14;
    private double halfPerimeter;
    private double S;
    private double side0;
    private double side1;
    private double side2;

    void calculateTheFloorage() {
        Scanner scanner = new Scanner(System.in);

        switch (scanner.next()) {
            case "triangle" -> {
                side0 = scanner.nextDouble();
                side1 = scanner.nextDouble();
                side2 = scanner.nextDouble();
                halfPerimeter = (side0 + side1 + side2) / 2;
                S = Math.sqrt(halfPerimeter *
                            (halfPerimeter - side0) *
                            (halfPerimeter - side1) *
                            (halfPerimeter - side2));
                System.out.println(S);
            }
            case "rectangle" -> {
                side0 = scanner.nextDouble();
                side1 = scanner.nextDouble();
                S = side0 * side1;
                System.out.println(S);
            }
            case "circle" -> {
                side0 = scanner.nextDouble();
                S = P * side0 * side0;
                System.out.println(S);
            }
            default -> throw new IllegalStateException("Unexpected value: " + scanner.next());
        }
    }
}
