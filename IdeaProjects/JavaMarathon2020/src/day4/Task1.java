package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner size = new Scanner(System.in);
        System.out.println("Введи размер массива:");
        int n = size.nextInt();

        int [] randomNumbers = new int[n];

        for (int i = 0; i < randomNumbers.length; i++)
            randomNumbers[i] = (int) (Math.random() * 11);

            System.out.print(Arrays.toString(randomNumbers));
            System.out.println();

            System.out.println("Длина массива: " + randomNumbers.length);


            int number8 = 0;
            for (int i = 0; i < randomNumbers.length; i++) {
                if (randomNumbers[i] > 8) ;
                number8 ++;
            }


            System.out.println("Количествео чисел больше 8: " + number8);

        int number1 = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] == 1) ;
            number1++;
        }


        System.out.println("Количествео чисел  равное 1: " + number1);

        int even = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] % 2 == 0) ;
            even ++;
        }


        System.out.println("Количествео четных чисел: " + even);

        int odd = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] % 2 != 0) ;
            odd ++;
        }


        System.out.println("Количествео нечетных чисел: " + odd);

        int sum = 0;
        for (int i = 0; i < randomNumbers.length; i++)
            sum = sum + randomNumbers[i];


        System.out.println("Сумма всех чисел: " + sum);
    }
}
