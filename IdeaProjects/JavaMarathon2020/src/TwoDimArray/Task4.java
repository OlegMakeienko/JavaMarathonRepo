package TwoDimArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
Дан двумерный массив. Сформировать одномерный массив только из четных элементов двумерного массива.
 */

public class Task4 {
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
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] % 2 == 0)
                    count++;
            }
        }
        System.out.println(count);


        int[] arrayWithEvenElements = new int[count];
        int a=0;


            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    if(a==count)
                        break;
                    else
                    if (array[i][j] % 2 == 0){
                        arrayWithEvenElements[a] = array[i][j];
                    a++;}
                }
                if(a==count) break;
            }

        System.out.println(Arrays.toString(arrayWithEvenElements));
    }
}
