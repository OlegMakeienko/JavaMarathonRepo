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
    }
}
