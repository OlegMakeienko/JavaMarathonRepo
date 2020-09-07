package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i=0; i<=30; i++){
            if (i%2==0)
                    numbers.add(i);

            }
        for (int i=300; i<350; i++){
            if (i%2==0)
                numbers.add(i);
        }

//        List<Integer> numbers1 = new ArrayList<>();
//        for (int i=31; i<300; i++){
//            if (i%2==0) {
//                numbers1.add(i);
//            }
//        }
//
//        numbers.removeAll(numbers1);

        System.out.println(numbers);

    }


}
