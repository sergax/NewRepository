package Task8.Generics1;

class Consumers<T> implements User<T> {
    public Consumers(T id, T sum) {
        System.out.println("is your(consumers) id:" + id + "\n" +
                "is your(consumers) sum:" + sum);
    }

    @Override
    public void usersInformation(Object idUser, Object sumUser) {
    }
}