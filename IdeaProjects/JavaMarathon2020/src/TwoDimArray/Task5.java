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
                array[i][j] = r.nextInt(99) + 1;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {

                System.out.print(array
                        [i][j] + " ");
            }
            System.out.println();
        }
    }
}
