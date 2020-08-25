package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введи количество этажей в доме:");
        int x = s.nextInt();
        if (x<1){
            System.out.println("Вылазь из подземелья и введи этажность дома целым положительным числом!");
        } else if (x<=4){
               System.out.println("Малоэтажный дом");
        }  else if (x<=8){
               System.out.println("Среднеэтажный дом");
        }  else {
               System.out.println("Многоэтажный дом");
        }
    }
}
