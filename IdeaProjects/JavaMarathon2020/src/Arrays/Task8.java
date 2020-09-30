package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Задается массив. Узнать, какие элементы встречаются в массиве больше одного раза.
 */
public class Task8 {
    public static void main(String[] args) {
        int [] array;
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter number of arrays size");
        n = scanner.nextInt();
        array = new int [n];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));

        for (int i=0; i< array.length; i++) {
            System.out.println("Index: " + i + "; Number: " + array[i]);
        }
        System.out.println();

        int counter = 0;
        int a = array[0];

            for (int i = 0; i < array.length; i++) {
                if (a == array[i])
                    System.out.println("Index: " + i + "; Number: " + array[i]);
            }

        a = array[1];

            for (int i = 0; i < array.length; i++) {
            if (a==array[i])
                System.out.println("Index: " + i + "; Number: " + array[i]);
            }

        a = array[2];
            for (int i = 0; i < array.length; i++) {
            if (a==array[i])
                System.out.println("Index: " + i + "; Number: " + array[i]);
        }
        // переменной нужно присвоить значение элемента массива под индексом 0,
        // затем пройтись по массиву и сравнить значения, если равно, то counter++  и вывести элемент на экран
        // после, переменной присвоить значение элемента под следующим индексом и повторить поиск и т.д.,
        // пока переменная меньше размера массива
        // попробовать рекурсию или while (до тех пор пока, затем меняется условие)

    }
}
