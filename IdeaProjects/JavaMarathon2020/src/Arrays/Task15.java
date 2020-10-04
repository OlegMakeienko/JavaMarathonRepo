package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Дан массив чисел.
Указать те его элементы, которые принадлежат отрезку [с, d].
 */
public class Task15 {
    public static void main(String[] args) {
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arrays size:");
        int n;
        n = sc.nextInt();
        arr = new int[n];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) - 50;
        }
        System.out.println(Arrays.toString(arr));

        int c;
        int d;

        System.out.println("Enter numbers c & d. cd - is part av array.");

        c = sc.nextInt();
        d = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if ((i>=c && i<=d) || (i<=c && i>=d))
                System.out.println("Numbers: " +arr[i]);

        }
    }
}
