package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 Даны целое число х и массив A[n].
 В массиве найти два соседних элемента, среднее арифметическое которых ближе
 всего к х.
 */
public class Task22 {
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
        int x;
        x = sc.nextInt();

        for (int i = 0; i < arr.length-1; i++) {
        if ((arr[i]+arr[i+1])/2==x)
            System.out.println("Exact: "+i +" "+ (i+1));
        else
            if ((arr[i]+arr[i+1])/2==(x+1) || (arr[i]+arr[i+1])/2==(x-1))
                System.out.println("+-"+"\n"+i +" "+ (i+1));

        }
    }
}
