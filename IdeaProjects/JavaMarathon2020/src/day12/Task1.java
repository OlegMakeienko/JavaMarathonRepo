package day12;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>() ;
        cars.add("Volvo");
        cars.add("Saab");
        cars.add("Kia");
        cars.add("Renault");
        cars.add("Toyota");

        System.out.println(cars);

        cars.add("Mercedes");
        cars.remove(0);

        System.out.println(cars);
    }

}

