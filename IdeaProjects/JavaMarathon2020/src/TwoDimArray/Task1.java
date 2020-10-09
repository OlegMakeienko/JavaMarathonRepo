package TwoDimArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 Написать программу, генерирующую магические квадраты заданного пользователем размера.

 Магическим квадратом порядка n называется квадратная матрица размера n × n,
 составленная из чисел 1, 2, ..., n2 так, что суммы по каждому столбцу,
 каждой строке и каждой из двух больших диагоналей равны между собой.
 Пример магического квадрата порядка 3: 6 1 8 7 5 3 2 9 4

 */
public class Task1 {
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter square size x & y :");

        x = sc.nextInt();
        y = sc.nextInt();
        int [][] magicSquare = new int[x][y];

        Random r = new Random();

        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare[0].length; j++) {
                magicSquare[i][j]=r.nextInt(10);
            }
        }

        for (int[] ints : magicSquare) {
            for (int j = 0; j < magicSquare[0].length; j++) {
            }
            System.out.println(Arrays.toString(ints));
        }
                System.out.println();

    }
}
