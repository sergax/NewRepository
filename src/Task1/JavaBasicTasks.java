package Task1;

/*
  *(задание со звездочкой) написать через что реализовано в java и  Написать пример кода данного принципа
  e: описываешь все примитивы (насколько можешь это сделать).
   */
public class JavaBasicTasks {

    public class Encapsulation {
        public class Cat {

            private String color;
            private String name;
            private int weight;


        }

        public class Inheritance {
            public class Animal {

                public String name;
                public int countOfLegs;
                public String voice;
                public String someFieldWithValue = "My animal";

                public void introduction () {
                    System.out.println ( "Hello I'm " + name + " I have " + countOfLegs + " legs" );
                }

                public String getVoice () {
                    return voice;
                }

                public void someMethodFromParent () {
                    System.out.println ( "I love people" );
                }

                public class Cat extends Animal {

                    public void gettingParentField () {
                        System.out.println ( super.someFieldWithValue );
                        super.someMethodFromParent ( );
                    }


                    public void catsOwnMethod () {
                        System.out.println ( "I'm catching mouse" );
                    }

                }


                public class Polymorphism {

                    public interface anotherAnimal {

                        void showMeVoice ();
                    }

                    public class Dog implements anotherAnimal {

                        @Override
                        public void showMeVoice () {
                            System.out.println ( "Woof - woof" );

                        }

                    }

                }

                public class Abstraction {
                    public abstract class AbstractClass {

                        public static int i = 0;
                        public abstract void myMethod ();
                        public int myMethod2 ( int variable ) {
                            return variable;
                        }
                    }
                }


                /*
                f: Описываешь 2умя способами формулы:
                        1.  ax^2 + bx + c = ? просто пишешь как есть.
                        2. Используешь стандартную библиотеку Math - никаких мат операций не должно быть,
                        только стандартная библиотека.
                 */
                public void Function () {
                    int a = 5;
                    int x = 4;
                    int b = 58;
                    int c = 654;

                    System.out.println ( a * x * x + b * x + c );

                    System.out.println ( (Math.incrementExact ( Math.multiplyExact ( a, ( int ) Math.pow ( x, 2 ) ) +
                            Math.multiplyExact ( b, x ) + c ) - 1) );
                }

                public static void main ( String[] args ) {

                }
            }
        }
    }
}
