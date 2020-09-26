package day18;
/*
1. Вам дан числовой массив произвольного размера.
Посчитайте сумму чисел в этом массиве не используя циклы (необходимо использовать рекурсивные вызовы).

Пример:
int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
System.out.println(someMethod(...)); // 65346

*Вместо someMethod(...) должен быть ваш рекурсивный метод, который вернет сумму чисел в массиве numbers.

 */
public class Task1 {
    public static void main(String[] args){
            int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
            System.out.println(sum(numbers, numbers.length-1));

        }

        public static int sum(int[] array, int index) {
            if (index == 0) {
                return array[0];
            } else {
                return array[index] + sum(array, index - 1);
            }
        }
}


