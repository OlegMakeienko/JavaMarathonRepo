package Arrays;
/*
Дан массив. Удалить из него нули и после каждого числа, оканчивающего на 5, вставить 1.
 */

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int [] a = {1,4,7,10,5,8,34,0,6,5,54,45,345};
        for ( int i=0; i<a.length; i++){
            if (a[i] == 0) {
                a[i] = 1;
            }
            if (a[i] % 5 == 0){
                a[i] = a[i]*10+1;
            }

        }


        System.out.println(Arrays.toString(a));

    }
}
