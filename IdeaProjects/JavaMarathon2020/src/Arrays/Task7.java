package Arrays;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Задается массив. Написать программу, которая вычисляет,
сколько раз введенная с клавиатуры цифра встречается
в массиве.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of arrays size");
        int n = s.nextInt();
        Random r = new Random();
        Integer [] arr = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter number");
        int a = s.nextInt();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==a)
                counter++;
        }
        System.out.println("Number " + a + " meeting " +
                counter +
                " times in this array");
    }
}
