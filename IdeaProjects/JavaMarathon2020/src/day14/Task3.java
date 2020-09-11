package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3  {

    public static void main(String[] args) {
        System.out.println(parseFileToObjList());
    }


public static List<Human> parseFileToObjList() {
    File file = new File("people.txt");
    List <Human> people = new ArrayList<>();
    try {
        Scanner s = new Scanner(file);
        while (s.hasNextLine()) {
            String line = s.nextLine();
            String[] humans = line.split(" ");
            if (Integer.parseInt(humans[1]) < 0) {
                throw new IllegalArgumentException();
            }
            Human human = new Human(humans[0],Integer.parseInt(humans[1]));
            people.add(human);
        }
        return people;

    } catch (FileNotFoundException e) {
        e.printStackTrace();
        }
    catch (IllegalArgumentException e){
        System.out.println("Error: age < 0 " + e);
    }
    return null;
}
}