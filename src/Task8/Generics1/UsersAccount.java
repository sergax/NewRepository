package Task8.Generics1;

class UsersAccount<T> {

    User methodFactory(T t) {
        if (t.equals("Consumer")) {
            return new Consumers("123", "55000");
        }
        if (t.equals("Partner")) {
            return new Partners("564", "1000000");
        }
        return null;
    }
}



