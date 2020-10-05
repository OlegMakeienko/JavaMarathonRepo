package Arrays;

import java.util.Arrays;

/*
Массив состоит из нулей и единиц.
Поставить в начало массива нули, а затем единицы.
 */
public class Task16 {
    public static void main(String[] args) {
        int [] array = {1,1,1,1,1,0,0,1,0,1,1,0,0,1,0,0,0,1,1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length ; i++) {
            Arrays.sort(array);
        }
        System.out.println(Arrays.toString(array));

    }
//                                                  Второе решение этой задачи


//    public static void main(String[] args) {
//        byte[] array = {0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1};
//        System.out.println(Arrays.toString(sort(array)));
//    }
//
//    public static byte[] sort(byte[] array) {
//        Arrays.sort(array);
//        return array;
//    }

}
