package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Дан целочисленный массив с количеством элементов n.
Напечатать те его элементы, индексы которых являются степенями двойки.
 */
public class Task11 {
    public static void main(String[] args) {
        int n;
        int [] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arrays size");
        n = sc.nextInt();
        array = new int[n];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]= r.nextInt(129);
        }
        System.out.println(Arrays.toString(array));

        for (int b=0; b<100; b++) {
        double a=Math.pow(2,b);
        for (int i = 0; i < array.length; i++) {
            if (a == array[i])
                System.out.println("index: " + i + " element: " + array[i]);
        }
        }
          printPowersOfTwo(array); // тут способ записи продвинутого пользователя 
    }
    public static void printPowersOfTwo(int[] array) {
          for (int number : array) {
                System.out.print(number >> Integer.numberOfTrailingZeros(number) == 1 ? number + " " : "");
              }
 }
}