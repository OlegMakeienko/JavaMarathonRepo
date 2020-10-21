package TwoDimArray;

import java.util.Random;
import java.util.Scanner;

/**
 Дан двумерный массив. Найти сумму элементов массива, начиная с элемента, индексы которого вводит
 пользователь, и заканчивая элементом, индексы которого вводит пользователь.
 */

public class Task5 {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter square size x & y :");

        x = sc.nextInt();
        y = sc.nextInt();
        int[][] array = new int[x][y];

        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = r.nextInt(3);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {

                System.out.print(array
                        [i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter first arrays number 'k' 'l' :");
        int k = sc.nextInt();
        int l = sc.nextInt();

        System.out.println("Enter first arrays number 'm' 'n' :");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;

        for (int i = k; i <= m; i++) {
            for (int j = l; j < array[i].length; j++) {
                sum += array[i][j];
                if(array[i][j]>array[i][n])
                    break;
                }
            }
        System.out.println(sum);

    }
}
