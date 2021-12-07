package Task4.HierarchyClasses;
/*1. 1. Написать иерархию классов так, чтоб был какой-то 1 общий класс - абстактный. У него было 2 наследника, которые описывают какой-то тип, а от него описывает уже реальный объект. Например:
Car- Грузовой - Какая-то модель грузового (BMW m-3 я наугад). Только  у тебя должно получиться МИНИМУМ 5 классов в общем числе для этого задания. Машины использовать запрещенно)

2. Написать Car car = new Bmw() (только под свои классы)-нижестоящий класс. Сказать работает ли такая конструкция - если да почему, если нет - почему.

3. Можем ли мы вызвать конструктор родительского класса? Можем ли мы вызвать внутри класса его другой конструктор - написать обе релазиации. Можно в задании 1 это сделать. Также с методами.*/

public abstract class Sport {

    public int yearOfBirth;

    public void informationAboutKindOfSport() {
        System.out.print(yearOfBirth);
    }

    public int getYearOfBirth(int yearOfBirth) {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
