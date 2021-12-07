package Task6.Util_2;

import Task6.Exceptions.EnotherException;
import Task6.Exceptions.ThirdException;

import java.io.IOException;

public class OptionsOfData {
    private String answerYes = "yes";
    private String answerNo = "no";

    public boolean optionsYesOrNo(String answer) throws IOException, EnotherException, ThirdException {
        try {
            if (answer.equals(answerYes)) {
                throw new EnotherException("You can't enter this data");
            }
        } catch (EnotherException e) {
            System.err.println(e.getMessage());
        }
        try {
            if (answer.equals(answerNo)) {
                throw new ThirdException("Re-enter your data");
            }
        } catch (ThirdException e) {
            System.err.println(e.getMessage());
        }
        return true;
    }
}


