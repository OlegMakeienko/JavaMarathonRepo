package Arrays;
/*
Сформировать одномерный массив из целых чисел.
Вывести на экран индексы тех элементов, которые кратны трем и пяти.
 */


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("введи размер массива");
        int n = s.nextInt();
        Random r = new Random();
        Integer [] array = new Integer[n];
        for (int i=0; i<array.length; i++){
            array[i]=r.nextInt(100);
        } System.out.println(Arrays.toString(array));
        for (int i=0; i<array.length; i++)
        if (array[i]%3 == 0 && array[i]%5 == 0)
            System.out.println("Index: "+i);
    }
}
