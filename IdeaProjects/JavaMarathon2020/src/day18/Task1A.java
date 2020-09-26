package day18;

public class Task1A {
        public static void main(String[] args){
            int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
            System.out.println(sum(numbers, 0));

        }

        public static int sum(int[] array, int index) {
            if (index == array.length)
                return 0;
            else {
                return array[index] + sum(array, index + 1);
            }
        }
    }

