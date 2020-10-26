package TwoDimArray;

import java.util.Random;
import java.util.Scanner;

/**
 Дана прямоугольная матрица.
 Найти строку с наибольшей и наименьшей суммой элементов.
 Вывести на печать найденные строки и суммы их элементов.
 */
public class Task12 {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle size x & y :");

        x = sc.nextInt();
        y = sc.nextInt();
        int[][] array = new int[x][y];

        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = r.nextInt(99)+1;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {

                System.out.print(array
                        [i][j] + " ");
            }
            System.out.println();
        }

        int [] maxSum = new int[array.length];
        for (int i = 0; i<array.length; i++) {
        int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
                maxSum[i] = sum;
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            System.out.print(maxSum[i] + " ");
            max = Math.max(max, maxSum[i]);
            min = Math.min(min,maxSum[i]);
        }

        for (int i = 0; i<array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
                if (sum == max) {
                    System.out.println("\nMax sum is: " + max + " in line #" + (i + 1));
                }
                if (sum == min) {
                    System.out.println("\nMin sum is: " + min + " in line #" + (i + 1));
                }
            }
        }
    }
}
