package Task8.Generics1;

class Partners <T> implements User <T> {
    public Partners(T id, T sum) {
        System.out.println("is your(partner) id:" + id + "\n" +
                "is your(partner) sum:" + sum);
    }

    @Override
    public void usersInformation(Object idUser, Object sumUser) {
    }
}