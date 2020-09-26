package Arrays;

public class Task3 {
        public static int[] removeElt(Integer[] arr, int remIndex){

            for (int i = remIndex; i < arr.length - 1; i++){
                arr[i] = arr[(i + 1)];
            }
            int[] newArr = new int[arr.length - 1];

            System.arraycopy(arr, 0, newArr, 0, arr.length - 1);

            return newArr;
        }
        //  Этот метод возвращает новый массив. Пример его использования:

        public static void main(String[] args) {

            Integer[] ar = {1, 2, 3, 4, 5};
            System.out.println("Исходный массив: ");
            for (int a : ar) {
                System.out.print(a + " ");
            }
            System.out.println("\nНовый массив: ");
            int[] newArr = removeElt(ar, 3);
            for (int a : newArr) {
                System.out.print(a + " ");

        }

    }
}
