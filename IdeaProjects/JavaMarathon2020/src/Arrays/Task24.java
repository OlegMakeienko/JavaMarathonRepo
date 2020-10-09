package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 Даны два массива А и В.
 Найти, сколько элементов массива А совпадает с элементами массива В.
 */
public class Task24 {
    public static void main(String[] args) {
        int[] arr1;
        int[] arr2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arrays size:");
        int n;
        n = sc.nextInt();
        arr1 = new int[n];
        arr2 = new int[n];
        Random r = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = r.nextInt(100);
            arr2[i] = r.nextInt(100);
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < n-1; i++) {
            if (arr1[i] == arr2[i])
                System.out.println("Element: " + arr1[i] + " match exactly.");
        }
        int counter = 0;
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j){
                    counter++;
                    System.out.println("Element: " + i + " occurs in another array");}

            }
        }
        System.out.println(counter + " elements of arr1 as the same as elements of arr2.");
    }
}
 // тут задача не решена до конца. есть элементы, которые встречаются два или больше раз в другом массиве.
 // я все равно их считаю. лень доделывать :)