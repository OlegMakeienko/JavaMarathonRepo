package TwoDimArray;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 Дан двумерный массив.
 Выяснить, в каких столбцах произведение элементов
 меньше введенного пользователем значения.
 */
public class Task13 {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle size x & y :");

        x = sc.nextInt();
        y = sc.nextInt();
        int[][] array = new int[x][y];

        Random r = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt(9) + 1;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array
                        [i][j] + " ");
            }
            System.out.println();
        }
        // найти произведение элементов в столбцах
        ArrayList <Integer> product = new ArrayList<>();
        int a = 0;
        for (int j = 0; j < y; j++) {
            int pr = 1;
            for (int i = 0; i < array.length; i++) {
                pr = array[i][j] * pr;
                }
            product.add(a, pr);
            a++;
            }
        System.out.println(product);


        int [] arrayProduct = new int [product.size()];

        for (int i = 0; i < product.size(); i++) {
            arrayProduct[i] = product.get(i);
        }

        // user enter number

        System.out.println("Enter a number: ");
        int usersNumber = sc.nextInt();

        for (int i = 0; i < arrayProduct.length; i++) {
            if (arrayProduct[i] < usersNumber)
                System.out.println("In column #" + (i+1) + " product of elements in the array is less then Users number.");
        }
    }
}
