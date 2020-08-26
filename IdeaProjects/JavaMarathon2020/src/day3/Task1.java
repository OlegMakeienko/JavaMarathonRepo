package day3;

import java.util.Scanner;

public class Task1 {                                 // Не могу остановить цикл, сдаюсь!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if ("Stop".equals(scanner)) {
           System.out.println("Программа завершена");
       }  else
        while (true) {
        System.out.println("Введи название города.");
        String string = scanner.nextLine();

            switch (string) {
                case ("Москва"), ("Владивосток"), ("Ростов")  -> System.out.println("Россия");
                case ("Милан"), ("Рим"), ("Турин")            -> System.out.println("Италия");
                case ("Ливерпуль"), ("Манчестер"), ("Лондон") -> System.out.println("Англия");
                case ("Мюнхен"), ("Берлин"), ("Кёльн")        -> System.out.println("Германия");
                default                                       -> System.out.println("Неизвестная страна");
                case ("Stop")                                 -> System.out.println("Программа завершена");
            }
        }   
    }
}
