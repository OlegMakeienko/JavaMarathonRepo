package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
    Дан целочисленный массив с количеством элементов n.
    Сжать массив, выбросив из него каждый второй элемент.
 */
public class Task20 {
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

        System.out.println(Arrays.toString(arrayReduce(arr)));

        int [] result = new int [arr.length/2+1]; // если длина массива нечетная   или нужно подумать о создании другой копии
        System.arraycopy(arr,0,result,0,arr.length/2+1);
        System.out.println(Arrays.toString(result));
    }

    public static int[] arrayReduce(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i = i + 2) {
            array[index] = array[i];
            index++;
        }

        Arrays.fill(array, index, array.length, 0);
        return array;
    }
}
