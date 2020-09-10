package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class OtherFileReader {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = separator + "Users" + separator + "oleg" + separator + "IdeaProjects" + separator +
                "JavaMarathon2020" + separator + "myNumbers.txt";


        try {
            File file = new File(path);


        Scanner s = new Scanner(file);
        String line = s.nextLine();
        String[] numbersString = line.split(" ");
        int [] numbers = new int[numbersString.length];
        int counter = 0;
        int sum = 0;

        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
            for(int i=0; i<numbers.length; i++) {
                    sum=sum+numbers[i];
                }
            }

            System.out.println(Arrays.toString(numbers));
                System.out.println(sum);
            }


        catch (FileNotFoundException e){
            System.out.println("Файл не найден " + e);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Некорректный входной файл. Выход за предел массива " + e);
        }
    }
}
