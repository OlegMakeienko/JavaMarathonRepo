package TwoDimArray;

import java.util.Random;
import java.util.Scanner;

/**
 В квадратной матрице определить максимальный и минимальные элементы.
 Если таких элементов несколько,
 то максимальный определяется по наибольшей сумме своих индексов,
 минимальный – по наименьшей.
 */

public class Task8 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter square size x :");

        x = sc.nextInt();
        int[][] array = new int[x][x];

        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt(99)+1;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array
                        [i][j] + " ");
            }
            System.out.println();
        }
        int maxElement = array[0][0];
        int minElement = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maxElement < array[i][j]) maxElement = array[i][j];
                if (minElement > array[i][j]) minElement = array[i][j];
            }
        }
        System.out.println("Min element is: " + minElement + " " + "Max element is: " + maxElement);

        int sumMinId;
        int sumMaxId;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (maxElement == array[i][j]) {
                    sumMaxId = i + j;
                    System.out.println("Max elements id is: " + "[" + i + "]" + "[" + j + "]" + " sum = " + sumMaxId);


                }
                if (minElement == array[i][j]) {
                    sumMinId = i + j;
                System.out.println("Min elements id is: " + "[" + i + "]" + "[" + j + "]" + " sum = " + sumMinId);
                }
            }
        }
    }
}
