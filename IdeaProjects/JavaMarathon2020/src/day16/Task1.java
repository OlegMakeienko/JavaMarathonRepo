package day16;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        File file = new File("myNumbers.txt");
        Scanner s = new Scanner(file);
        String line = s.nextLine();
        String[] numbers = line.split(" ");


        System.out.println(Arrays.toString(numbers));

        float sum = 0;
        for (String number : numbers)
            sum += Float.parseFloat(number);
        double x = sum/ numbers.length;

        System.out.println(x);

        double y = Math.round(x*1000)/1000.0d;

        System.out.println(y);


    }
}
