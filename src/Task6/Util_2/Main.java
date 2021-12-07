package Task6.Util_2;
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

import Task6.Exceptions.EnotherException;
import Task6.Exceptions.FirstException;
import Task6.Exceptions.ForthException;
import Task6.Exceptions.ThirdException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FirstException, EnotherException, ThirdException, ForthException, IOException {
        ReaderClass readerClass = new ReaderClass();
        OptionsOfData optionsOfData = new OptionsOfData();
        WriterClass writerClass = new WriterClass();
        for (int i = 0; i < 3; i++) {
            readerClass.readData();
            String s = readerClass.parseOfInt();
            writerClass.writerData(s);
        }
    }
}

