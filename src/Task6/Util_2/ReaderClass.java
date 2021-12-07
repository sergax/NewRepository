package Task6.Util_2;

import Task6.Exceptions.EnotherException;
import Task6.Exceptions.FirstException;
import Task6.Exceptions.ThirdException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderClass {
    protected String result;
    protected String problem = "Some problem, sorry .( ";
    protected String answer;
    private String name;
    private String age;
    private String[] listOfData;
    private OptionsOfData optionsOfData = new OptionsOfData();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String readData() throws IOException {
        try {
            System.out.println("Enter your name and age");
            listOfData = reader.readLine().split(" ");
            name = listOfData[0];
            age = listOfData[1];
            result = name + " " + age;
            return result;
        }catch (ArrayIndexOutOfBoundsException|NullPointerException|NumberFormatException e){
            System.err.println(problem);
        }
        return null;
    }

    public String parseOfInt() throws FirstException, EnotherException, ThirdException, IOException {
        int ageInt = Integer.parseInt(age);
        try {
            if (ageInt < 18 || ageInt > 65 | name.length() < 5) {
                throw new FirstException("You've entered wrong data and you can't change them" +
                        "\nAre you agree yes/no ?");
            }
        } catch (FirstException e) {
            System.err.println(e.getMessage());
            answer = reader.readLine();
            optionsOfData.optionsYesOrNo(answer);
            result = readData();
            parseOfInt();
        }
        return result;
    }
}

