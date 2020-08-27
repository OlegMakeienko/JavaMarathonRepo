package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

           while (true) {
                    System.out.println("Введи название города.");
                    String city = scanner.nextLine();

                    if (city.equals("Stop")) {
                       System.out.println("Программа завершена");
                       break;   }
                       
                   switch (city) {
                       case ("Москва"):
                       case ("Владивосток"):
                       case ("Ростов"):
                           System.out.println("Россия");
                           break;
                       case ("Милан"):
                       case ("Рим"):
                       case ("Турин"):
                           System.out.println("Италия");
                           break;
                       case ("Ливерпуль"):
                       case ("Манчестер"):
                       case ("Лондон"):
                           System.out.println("Англия");
                           break;
                       case ("Мюнхен"):
                       case ("Берлин"):
                       case ("Кёльн"):
                           System.out.println("Германия");
                           break;
                       default:
                           System.out.println("Неизвестная страна");
                           break;
                   }

                }

            
    }
}
