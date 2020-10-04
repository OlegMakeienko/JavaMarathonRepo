package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Задан массив действительных чисел.
Определить, сколько раз меняется знак в данной последовательности чисел,
напечатать номера позиций, в которых происходит смена знака.
*/
public class Task13 {
    public static void main(String[] args) {
        int [] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arrays size:");
        int n;
        n = sc.nextInt();
        arr = new int [n];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100)-50;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println(positiveNegativeFirst(arr));

        int counter = 0;
        for (int i = 0; i < arr.length-1; i++) {
            int a = arr[i];
            int b = arr[i+1];
            if((a<0 && b<0) || (a>0 && b>0)) counter = counter;
            else {counter++;
                System.out.println("Index: " + (i+1));
            }
        }
        System.out.println(counter);



    }
    public static String positiveNegativeFirst(int[] array) { //  метод определяет, что первым - или +
            if (array[0] > 0) {
                return "positive";
            } else if (array[0] < 0) {
                return "negative";
            } else
        return "none"; // в случае, если массив состоит из нулей
    }
}
