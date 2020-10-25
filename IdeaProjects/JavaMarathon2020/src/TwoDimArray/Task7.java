package TwoDimArray;

import java.util.Random;
import java.util.Scanner;

/**
 Вычислить сумму и число положительных элементов матрицы A[N, N], находящихся над главной диагональю.
 */

public class Task7 {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter square size x & y :");

        x = sc.nextInt();
        y = sc.nextInt();
        int[][] array = new int[x][y];

        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt(99) + 1;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array
                        [i][j] + " ");
            }
            System.out.println();
        }

        int counter = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (array[j][i]%2==0)           // элементы над диагональю, включая диагональ. чтоб
                                                // исключить диагональ, цикл начинать с 1
                    counter++;
                    sum += array[j][i];
            }
        }
            System.out.println(counter + " " + sum);
    }
}
