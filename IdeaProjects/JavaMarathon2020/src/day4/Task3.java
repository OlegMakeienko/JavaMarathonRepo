package day4;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Ввести количество строк и столбцов: ");

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int [][] matrices = new int[m][n];

        Random random = new Random();

        for (int i = 0; i < matrices.length; i++)
            for (int j = 0; j < matrices[i].length; j++) {
                matrices[i][j] = random.nextInt(50);
            }
        for (int i = 0; i < matrices.length; i++) {
            for (int j = 0; j < matrices[i].length; j++)

                System.out.print(matrices[i][j] + " ");

            System.out.println();

        }
        int maxSum = 0;
        int maxSumId = 0;
        for (int i=0; i<matrices.length; i++){
            int sum =0;
            for (int j=0; j< matrices[i].length; j++) {
                sum += matrices[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                maxSumId = i;

            }
        }
        System.out.println("Индекс последней строки с максимальной суммой значений:");
        System.out.println(maxSumId);

    }
}
