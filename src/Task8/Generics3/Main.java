package Task8.Generics3;

import java.util.ArrayList;

/*
1. Создать класс общего характера (можно абстрактный)
2. Создать 2 произвольных от него, которые будут наследоваться.
3. Создать 2 интерфейс, который будет делать какое-то действие - и этот интерфейс будет наследовать только 1 - родителя, 2 - только одного.
Пример:
class Parent impelent interfaceA {}
class ChildOne extend Parent implement InterfaceB{}
class ChildTwo extend Parent

Метод интерфейсаА должен принимать(List<Parent>, T t)
Метод ИнтерфейсаБ должен принимать (List<Parent>) и возвращать ТОЛЬКО обЪекты типа ИнтерфесаБ(либо класса ChildOne)
Внутри родителя должен быть:
 LIst<T>
name,
и какой-то кастомный параметр.
У наследников должно быть по 1 полю сверху (но они должны быть разными).
Все это должно быть параметеризировано
 */
public class Main {
    public static void main(String[] args) {
        StudentOfMathClass mathClass = new StudentOfMathClass(new ArrayList(),"Derim",5,011);
        mathClass.displayHomeTasks(new ArrayList<>());
        StudentOfPhysicClass physicClass = new StudentOfPhysicClass(new ArrayList(),"Physic",4,56);
        System.out.print(physicClass.getMark());
        System.out.print(physicClass.getSubjectsName());
    }
}
