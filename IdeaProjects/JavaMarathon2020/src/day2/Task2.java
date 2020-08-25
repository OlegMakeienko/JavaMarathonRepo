package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sс = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int a = sс.nextInt();
        int b = sс.nextInt();

        for(int i = a; i <= b; i ++){
            if (i%10 == 0) {
                System.out.print(" ");
            } else if (i%5 == 0) {
                System.out.print(i);
            }
        }
    }
}
