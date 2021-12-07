package Task6.Util.consile_reader;

import Task6.Exceptions.EnotherException;
import Task6.Exceptions.FirstException;
import Task6.Exceptions.ThirdException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadUsersData {
    //именуем переменные согласно бизнес логики в классе
    String name;
    String age;
    String string;
    private final int MIN_LENGTH_OF_NAME = 5;

    public String inputData() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        string = reader.readLine();
        String[] parts = string.split(" ");
        name = parts[0];
        age = parts[1];
        int ageInt = Integer.parseInt(parts[1]);

        try {
            if (ageInt < 18 || ageInt > 65 | name.length() < MIN_LENGTH_OF_NAME) {
                throw new FirstException("You've entered wrong data and you can't change them" +
                        "\nAre you agree yes/no ?");
            }
        } catch (FirstException e) {
            System.err.println(e.getMessage());
            string = reader.readLine();
        }
        try {
            if (string.equals("yes")) {
                throw new EnotherException("You can't enter this data");
            }
        } catch (EnotherException ex) {
            System.err.println(ex.getMessage());
        }
        try {
            if (string.equals("no")) {
                throw new ThirdException("Re-enter your data");
            }
        } catch (ThirdException exc) {
            System.out.println(exc.getMessage());
        }
        return name + " " + age;
    }
}
