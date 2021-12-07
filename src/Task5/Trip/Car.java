package Task5.Trip;


import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class Car {
    private List<Pasenger> listOfPasanger;

    public Car(List<Pasenger> listOfPasanger) {
        this.listOfPasanger = newListOfPessanger(listOfPasanger);
    }
//example of incapsulation
    private List<Pasenger> newListOfPessanger (List<Pasenger> oldList) {
        List<Pasenger> newList = new ArrayList<>();
        for(Pasenger pasenger : oldList) {
            newList.add(pasenger);
        }
        return newList;
    }

    public List<Pasenger> getListOfPasanger() {
        //return  listOfPasanger;
        return newListOfPessanger(listOfPasanger);
    }
}
