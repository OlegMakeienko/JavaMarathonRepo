package day15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws IOException {
        File file = new File("shoes");
        List<Shoes> nextShoes = new ArrayList<>();

        PrintWriter pw = new PrintWriter("absenceShoes");

        Scanner s = new Scanner(file);
        while (s.hasNextLine()) {
            String[] array = s.nextLine().split(";");
            if (Integer.parseInt(array[2]) == 0) {
                pw.println(array[0] + ";  " + array[1] + "; " + array[2]);
            }
        }
        pw.close();
        s.close();
    }
}
