package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введи количество этажей в доме:");
        int floorCount = s.nextInt();
        if (floorCount<1){
            System.out.println("Вылазь из подвала и посмотри этажность дома!");
        } else if (floorCount>=1 && floorCount<=4){
               System.out.println("Малоэтажный дом");
        }  else if (floorCount>=5 && floorCount<=8){
               System.out.println("Среднеэтажный дом");
        }  else {
               System.out.println("Многоэтажный дом");
        }
    }
}
