package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
В массиве целых чисел найти наиболее часто встречающееся число.
Если таких чисел несколько, то определить наименьшее из них.
 */
public class Task18 {
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

        printNumberFrequency(arr);
    }

    public static void printNumberFrequency(int[] array) {
        int[] freq = new int[array.length];
        int globalFreqCounter = 0;
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == number) {
                    counter++;
                }
            }
            freq[i] = counter;
            if (counter > globalFreqCounter) {
                globalFreqCounter = counter;
            }
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == globalFreqCounter && array[i] < result) {
                result = array[i];
            }
        }

        System.out.println(result);
    }
}
