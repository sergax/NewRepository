package Task8.Generics1;
/*
Написать класс обычный параметизированный типом T.
Чтоб он имел метод который принимает тип Т и что-то делал, который выдаает тип Т (к примеру фабрика)
 */

public class Main {
    public static void main(String[] args) {
        UsersAccount usersAccount = new UsersAccount();
        User <String> user = usersAccount.methodFactory("Partner");
    }
}
