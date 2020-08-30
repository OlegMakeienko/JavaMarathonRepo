package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] arrayBigRandom = new int[100];

        Random random = new Random();

        for (int i = 0; i < arrayBigRandom.length; i++)
            arrayBigRandom[i] = random.nextInt(10000);

        int max = 0;
        for (int element : arrayBigRandom) {
            if (element > max)
                max = element;
        }
        System.out.println("Наибольший элемент массива: " + max);

        int min = 10000;
        for (int element : arrayBigRandom) {
            if (element < min)
                min = element;
        }
        System.out.println("Наименьший элемент массива: " + min);

        int endNoll = 0;
        for (int i = 0; i < arrayBigRandom.length; i++) {
            if (arrayBigRandom[i] % 10 == 0)
                endNoll ++;
        }


        System.out.println("Количествео чисел c 0 в окончании: " + endNoll);

        int sumEndNoll = 0;
        for (int element : arrayBigRandom) {
            if (element % 10 == 0)
                sumEndNoll += element;
        }


        System.out.println("Сумма чисел c 0 в окончании: " + sumEndNoll);
    }
}
