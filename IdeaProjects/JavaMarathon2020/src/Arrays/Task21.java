package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 Дан массив, состоящий из n натуральных чисел.
 Образовать новый массив, элементами которого будут элементы
 исходного, оканчивающиеся на цифру k.
 */
public class Task21 {
    public static void main(String[] args) {
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arrays size:");
        int n;
        n = sc.nextInt();
        arr = new int[n];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("\nEnter number:");
        int a;
        a = sc.nextInt();

        System.out.println(Arrays.toString(elementsWithNumberA(arr, a)));

    }
    public static int[] elementsWithNumberA(int[] array, int digit) {
        int counter = 0;
        for (int j : array) {
            if (j % 10 == digit) {
                counter++;
            }
        }

        int[] result = new int[counter]; // counter is index of arr

        counter = 0;
        for (int j : array) {
            if (j % 10 == digit) {
                result[counter++] = j;
            }
        }
        return result;
    }
}
