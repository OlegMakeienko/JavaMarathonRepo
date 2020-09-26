package Arrays;

/*
Сформировать одномерный массив случайным образом.

Определить количество четных элементов массива,
стоящих на четных местах.
 */

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи размер массива");
        n = scanner.nextInt();
        Integer [] integers = new Integer[n];
        Random random = new Random();

        for (int i=0; i< integers.length; i++) {
             integers [i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(integers));

// Определить количество четных элементов массива,


        int counter = 0;
        for(int i=0;i<integers.length;i++) {
            if(integers[i]%2==0) {
                if (i % 2 == 0) {   // стоящих на четных местах.
                    counter++;
                    System.out.println("Index: " + i + "; Number: " + integers[i]);
                }
            }
        }

        System.out.println(counter);


    }
}
