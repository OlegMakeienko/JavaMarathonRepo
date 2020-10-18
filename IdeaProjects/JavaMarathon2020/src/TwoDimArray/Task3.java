package TwoDimArray;

import java.util.Random;
import java.util.Scanner;

/**
 Дан двумерный массив.
 Поменять местами значения элементов столбца и строки
 на месте стыка минимального значения массива (или первого из минимальных).
 Например, если индекс минимального элемента (3;1), т.е. он
 находится на пересечении 3 строки и 1 столбца,
 то 3 строку сделать 1 столбцом, а 1 столбец сделать 3 строкой.
 */
public class Task3 {
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

        int minInRow = array[0][0]; //находим минимальное значение
        for (int i = 0, arrayLength = array.length; i < arrayLength; i++) {
            int[] ints = array[i];
            for (int j = 0; j < ints.length; j++) {
                int anInt = ints[j];
                if (minInRow > anInt) {
                    minInRow = anInt;
                }
            }
        }  System.out.println("Minimum in row is " + minInRow);

        int a = 0,b = 0;
        for (int i = 0; i < array.length; i++) {   //находим индекс минимального элемента
            for (int j = 0; j < array[i].length; j++) {
            if (minInRow == array[i][j]){
                System.out.println( "Index: " + "[" + i + "]" + "[" + j + "]");
            a=i;
            b=j;
                }
            }
        }
        System.out.println(a + " " + b);

                                                    // нужно скопировать массив и заменить столбец строкой



            int [][] arrayCopy = new int[x][y];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                                                 // тут переворачивается столбец в стоку
                arrayCopy[a][j] = array [j][b];

                System.out.print(arrayCopy
                        [i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("======");

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    arrayCopy[i][b] = array [a][i];     // тут переворачивается строка в столбец

                System.out.print(arrayCopy
                        [i][j] + " ");
                }
                System.out.println();
            }

        System.out.println("=======================");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (arrayCopy[i][j] == 0)
                    arrayCopy[i][j] = array[i][j];

                System.out.print(arrayCopy
                        [i][j] + " ");
            }
            System.out.println();
        }
    }
}
