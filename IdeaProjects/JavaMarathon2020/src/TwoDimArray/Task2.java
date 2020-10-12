package TwoDimArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 Дан двумерный числовой массив.
 Значения элементов главной диагонали возвести в квадрат.
 */

public class Task2 {
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

        for (int i = 0; i<magicSquare.length; i++) {
            for (int j = 0; j < magicSquare[0].length; j++){

            System.out.print(magicSquare[i][j] + " ");
            }
        System.out.println();
        }

        int counter = 1;
        for (int z=0; z< magicSquare.length; z++) {
            System.out.print("Element " + counter + " of major diagonal is " + magicSquare[z][z] + " ");
            int a = magicSquare[z][z];
            if (a==0) System.out.println();
            else
            if (a>0) {

                double b = Math.pow(a, 2);

                System.out.println("and its square is " + b + " ");
            }
            counter++;
        }

        int w = x-1;
        while (w < magicSquare.length) {
            System.out.print(magicSquare[w][w] + " ");
        if (w==0)
            break;
            w--;
        }

        System.out.println();

                                                            //   вторая диагональ сверху вниз:
        for (int e = 0; e< magicSquare.length; e++) {
            System.out.print(magicSquare[e][(magicSquare.length-1)-e]+" ");
        }
    }
}

