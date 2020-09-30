package Arrays;
/*
Даны целые числа а1, а2,..., аn. Вывести на печать только те числа, для которых аi ≥ i.
 */
public class Task10 {
    public static void main(String[] args) {
        int [] arr = {1,4,56,8,9,5,3,2,5,8,99,6,4,32,1,4,567,6};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=i)
                System.out.print(arr[i]+" ");
        }
    }
}
