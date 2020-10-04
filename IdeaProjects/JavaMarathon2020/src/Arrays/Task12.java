package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Задана последовательность из N чисел.
Определить, сколько среди них чисел меньших К, равных К и больших К.
*/
public class Task12 {
    public static void main(String[] args) {
        int [] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arrays size:");
        int n;
        n = sc.nextInt();
        arr = new int [n];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter a number K:");
        int k;
        k = sc.nextInt();
        int counterK = 0;
        int counterKLess = 0;
        int counterKMore = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==k){
                System.out.println("Index: " + i);
                counterK++;}
        }
        System.out.println("'K' meeting " + counterK + " time.");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<k)
                counterKLess++;
            }
        System.out.println("Numbers of numbers in array < 'K' is " + counterKLess);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>k)
                counterKMore++;
        }
        System.out.println("Numbers of numbers in array > 'K' is " + counterKMore);

    }
}
