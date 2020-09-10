package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("myNumbers.txt");

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

        if (numbers.length != 10)
            throw new IllegalArgumentException();
            System.out.println(Arrays.toString(numbers));

            int sum = 0;
            for (String number : numbers)
                sum += Integer.parseInt(number);

            System.out.println(sum);


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден :( " + e);
        } catch (IllegalArgumentException  e) {
            System.out.println("Неверная длина массива " + e);
        }
    }
}
