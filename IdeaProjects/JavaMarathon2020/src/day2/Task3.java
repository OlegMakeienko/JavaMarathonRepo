package day2;

import java.util.Scanner;

public class Task3 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Введите 2 числа");      // Тут я не понимаю. Ведь цикл while
                                                        // предполагает, что переменная должна быть инициализирована.
                                                        // и, если задать эту переменную <a, то программа не сработает
            int a = s.nextInt();
            int b = s.nextInt();
            int i = 5;
            while (i>a && i<b) {
                System.out.print(i + " ");
                i+=10;
            }
        }
}
