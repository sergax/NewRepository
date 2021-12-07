package Task6.Util.file_writer;
/*
Практическая:
1. Создать 3 кастомные ошибки.
2. Создать класс который  будет отвечать за запись в файл.
3. Создать класс, который будет отвечать за считывание данных с клавиатуры.
Само задание:
Нужно попросить пользователя ввести его имя и возраст. Если возраст меньше 18 либо больше 65, или же имеет дробное число
(22.5, 46,643 и.т.д)  ИЛИ имя меньше 5 знаков- то мы в консоль оповещаем пользователя, что его данные НЕ ВАЛИДНЫ через 1 ошибку.
Но ошибка не закрывает приложение. Она в консоль пишет через:
system.out.error (выделит текст красным)- что пользователь ввел не правлиьные данные, и они не смогут быть изминенны.
Если пользователь СОГЛАСЕН то ты вызываешь вторую ошибку - что его данные не подлежат введению в файл. Если же он не согласен -
дать попытку ввести данные повторно.
Если все данные правильные - записать их в файл.
ЗАпись в файл должна быть примерно вот такая:

1. Вася 27
2. коля 18
3. Алина 58

Важно:
Порядок ввода пользователя всегда одинаков, пользователь не может ввести сначала возраст а потом имя. Он всегда вводит:
Имя и возраст, всегда через пробел. Отличаются только данные которые вводит пользователя.

Если в программе произошла ошибка, но ты её не обработал - то должна вызваться 3 ошибка, которая оповестит что в программе
критическая проблема - и закроет приложение.
 */

import Task6.Util.consile_reader.ReadUsersData;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteExceptions {
    public static void main(String[] args) {

        ReadUsersData person = new ReadUsersData();

        try (BufferedWriter writeToFile = new BufferedWriter(new FileWriter("listOfUsers.txt"));) {

            System.out.println("Put your name and age");
            writeToFile.write(person.inputData() + "\n");
            System.out.println("Put your name and age");
            writeToFile.write(person.inputData() + "\n");
            System.out.println("Put your name and age");
            writeToFile.write(person.inputData() + "\n");

        } catch (IOException e) {
            System.out.println("Critical Error");
        }
    }
}
