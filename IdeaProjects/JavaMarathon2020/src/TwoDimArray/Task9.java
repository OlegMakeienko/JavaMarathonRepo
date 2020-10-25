package TwoDimArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 Для заданной квадратной матрицы сформировать одномерный массив из ее диагональных элементов.
 */
public class Task9 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter square size x:");

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
        int a=0;
        int [] diagonalElements = new int[array.length];
        for (int i = 0; i < array.length; i++) {
                diagonalElements[a] = array[i][i];
                a++;
            }
        System.out.println(Arrays.toString(diagonalElements));
    }
}
