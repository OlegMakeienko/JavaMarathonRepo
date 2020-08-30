package day6;

public class Task2 {
    public static void main(String[] args) {
        Plane plane = new Plane("Saab 340","Blue",1983,20, 8140,3220);
        plane.fillUp(800);
        plane.info();
        System.out.println("Самолет заправили горючим на " + plane.getVolumeInTank() + " литров");

        System.out.println();

        Plane plane1 = new Plane("Heinkel", "green",1923,13,1863,400);

        plane1.setManufacturer("Heinkel 12");
        plane1.fillUp(100);
        plane1.fillUp(30);
        plane1.info();

        System.out.println("Самолет заправили горючим на " + plane1.getVolumeInTank() + " литров");

    }
}
