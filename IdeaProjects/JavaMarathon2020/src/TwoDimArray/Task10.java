package TwoDimArray;

import java.util.Random;
import java.util.Scanner;

/**
 Заданы матрица порядка n и число k. Вычесть из элементов k-й строки диагональный элемент, расположенный в
 этой строке.
 */
public class Task10 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter square size n :");

        x = sc.nextInt();

        int[][] array = new int[x][x];

        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt(5)+1;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array
                        [i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nEnter number k (k must be < x):");
        int k = sc.nextInt();


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == k) {
                    array[i][j] = array[i][j] - array[k][k];   // не понимаю, почему для  j>k не изменяется элемент
                }

                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
