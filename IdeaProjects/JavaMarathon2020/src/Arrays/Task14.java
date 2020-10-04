package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Задана последовательность N чисел.
Вычислить сумму чисел, порядковые номера которых являются простыми
числами.
 */
public class Task14 {
    public static void main(String[] args) {
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arrays size:");
        int n;
        n = sc.nextInt();
        arr = new int[n];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (int i = 2; i < arr.length; i++) {
            boolean isPrime = true;

                                                    // проверяем число на простоту
            for (int a=2; a*a<=i; a++) {
                int temp = i % a;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }
                                                    // если переменная isPrime равна true, то число простое
            if(isPrime) {
                System.out.println(i + " - простое число");
                sum += arr[i];
            } else {
                System.out.println(i + " - составное число");
            }
            System.out.println(sum);
        }
        System.out.println("Result sum: " +sum);

    }

}
