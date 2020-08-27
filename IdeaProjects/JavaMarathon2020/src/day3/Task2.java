package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

        System.out.println("Введи делимое и делитель:");

        double i = scanner.nextDouble();
        double j = scanner.nextDouble();


            if (j == 0) {
                System.out.println("Делить на 0 нельзя! Программа завершена!");
                break;
            }
            System.out.println(i / j);


        }

    }
}