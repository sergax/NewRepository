package Task4.HierarchyClasses;

public class Main {
    public static void main(String[] args) {
        // пример п.2, для такого объявления Sport sport = new Boxing
        Boxing sport = new Boxing();
        Sport sport2 = new MixMartelArts();
        Sport sport3 = new OlimicsSport();
        Swimming sport4 = new Swimming();

        sport2.getYearOfBirth(1985);
        sport3.getYearOfBirth(1995);

        sport.rightHook();
        sport4.nextYearForOlimpiada();

    }
}
