package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList());
    }

    public static List<String> parseFileToStringList() {
        File f = new File("people.txt");
        List<String> people = new ArrayList<>();
        try {
            Scanner s = new Scanner(f);

            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] person =  line.split(" ");
                if (Integer.parseInt(person[1]) < 0){
                    throw new IllegalArgumentException();
                }
                people.add(line);
            }
            return people;


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден " + e);
        } catch (IllegalArgumentException e) {
            System.out.println("Возраст не может быть отрицательным");
        } return null;
    }
}


