package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        for (a=0; a<=4; a++) {

            System.out.println("Введи делимое и делитель:");

            double i = scanner.nextDouble();
            double j = scanner.nextDouble();


            if (j == 0) {
                System.out.println("Делить на 0 нельзя!");
                continue;
            }
            System.out.println(i / j);
        }
    }
}
