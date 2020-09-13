package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2A {
    public static void main(String[] args) throws FileNotFoundException {
        Random random = new Random();

        File file = new File("input1.txt");
        PrintWriter pw = new PrintWriter(file);
        for (int i=0; i<1000; i++)
        pw.println(random.nextInt(100));

        pw.close();

        Scanner s = new Scanner(file);
        File file1 = new File("summaKazdyh20.txt");
        PrintWriter pw1 = new PrintWriter(file1);

        int sum = 0;
        int counter = 0;
        while (s.hasNextLine()){
            sum += Integer.parseInt(s.nextLine());
            counter ++;
            if (counter == 20) {
                pw1.println(sum / 20.0);

                counter = 0;
                sum = 0;
            }
        } pw1.close();

        Scanner s1 = new Scanner(file1);
        double sum1 = 0;
        while (s1.hasNextLine()) {
            sum1 += Double.parseDouble(s1.nextLine());
        }
        System.out.println((int) sum1);
    }
}
