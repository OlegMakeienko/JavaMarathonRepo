package Arrays;

/*
Задается массив.
Определить порядковые номера элементов массива,
значения которых содержат последнюю
цифру первого элемента массива 2 раза (т.е. в массиве должны быть не только однозначные числа).
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("введи размер массива");
        int n = s.nextInt();

        Integer [] array = new Integer[n];
        Random r = new Random();
        for (int i=0; i< array.length; i++) {
            array[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        for (int i=0; i< array.length; i++) {
            System.out.println("Index: " + i + "; Number: " + array[i]);
        }
        System.out.println(array[0]); //  число первого элемента массива
        int w = array[0]%10; // взятие остатка от деления "%" числа на 10, всегда вам даст последнее из его цифр

        System.out.println(w);

        int b;

        for (int i=0; i< array.length; i++) {
        int a = array[i];

            if (a%10 == w) {   a = a/10;} // тут левая цифра, если она равна w, то отсекаем ее и
            if (a == w) {                 // получаем правую цифру. если и она равна w, то печатаем индекс
                System.out.println("index: " + i);
            }
        }
    }
}
