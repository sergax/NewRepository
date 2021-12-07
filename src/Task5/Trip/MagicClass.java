package Task5.Trip;

import java.util.ArrayList;
import java.util.List;

public class MagicClass {
    public static void main(String[] args) {
        Pasenger vasia = new Pasenger("Vasia", true);
        Pasenger kolia = new Pasenger("Kolia", true);
        Pasenger vital = new Pasenger("Vital", true);
        List<Pasenger> listOfpassengar = new ArrayList<>();
        listOfpassengar.add(vasia);
        listOfpassengar.add(kolia);
        listOfpassengar.add(vital);

        Car bmw = new Car(listOfpassengar);
        Pasenger zayatc = new Pasenger("Zayatc", false);
        listOfpassengar.add(zayatc);
        bmw.getListOfPasanger().add(zayatc);
        System.out.println(bmw);
    }
}
