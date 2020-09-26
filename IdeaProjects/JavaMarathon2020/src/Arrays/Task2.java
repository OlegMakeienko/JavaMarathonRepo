package Arrays;

import java.util.*;

/*
Случайным образом генерируется массив чисел.
Пользователь вводит числа a и b.
Заменить элемент массива на сумму его соседей,
если элемент массива четный и номер его лежит в промежутке от a до b.
 */
public class Task2 extends Task3 {
    public static void main(String[] args) {

        Integer [] arr = new Integer[10];
          Random rnd = new Random();
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=rnd.nextInt(10);
        }
        System.out.println("Числа в массиве сгенерированы.");
        System.out.println(Arrays.toString(arr));
//

        System.out.println("Введи два числа от 0 до 10");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i=1; i<arr.length; i++){      // чтоб избежать выбрасывания ошибки
            if (arr[i] > a && arr[i] < b && arr[i]%2==0){

                System.out.println(arr[i]);

                arr[i] = arr[(i-1)]+arr[(i+1)];
           }


        } System.out.println(Arrays.toString(arr));


/*
В одномерном массиве удалить промежуток элементов от максимального до минимального.
*/

         List<Integer> arrList = new LinkedList<>(Arrays.asList(arr));

        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        Integer tmpVal;
        for (Integer integer : arrList) {
            tmpVal = integer;
            if (tmpVal > maximum) {
                maximum = tmpVal;
            }
            if (tmpVal < minimum) {
                minimum = tmpVal;
            }
        }
        int indMin = Math.min(arrList.indexOf(minimum),arrList.indexOf(maximum));
        int indMax = Math.max(arrList.lastIndexOf(minimum),arrList.lastIndexOf(maximum));
        System.out.println("\nНаибольший элемент: " + maximum);
        System.out.println("Наименьший элемент: " + minimum);

        arrList.subList((indMin + 1), indMax).clear();

        System.out.println(arrList);


        for (int i: arrList){
            System.out.print(i+ " " );
        }
        System.out.print(" ");

    }
}
