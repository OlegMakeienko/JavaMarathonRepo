package Arrays;

/*
Дан массив натуральных чисел. Найти сумму элементов, кратных данному K
 */
public class Task9 {

        //  создаю функцию подсчета суммы c помощью цикла for

        public static int sum(int[] array, int number) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % number == 0) {
                    sum += array[i];
                }
            }
            return sum;
        }

    //  создаю функцию подсчета суммы c помощью цикла foreach

    public static int funcSum(int[] array, int number) {
        int sum = 0;
        for (int value : array) {
            if (value % number == 0) {
                sum += value;
            }
        }
        return sum;
    }

    // подставляю функцию в метод main

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println("Sum is: " + funcSum(array, 3));
        System.out.println("Sum is: " + sum(array, 5));
    }

}
