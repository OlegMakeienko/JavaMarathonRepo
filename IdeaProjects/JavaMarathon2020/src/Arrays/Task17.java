package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Дан массив целых положительных чисел.
Найти среди них те, которые являются квадратами некоторого числа х.
 */
public class Task17 {
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

        System.out.println();

        System.out.println("Enter number");
        int x = sc.nextInt();
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == x * x)
                System.out.println("Arrays element equal to square av x is " +arr[i] + " with index: "+i);
        }
    }
}
