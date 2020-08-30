package day7;

public class Task1 {
    public static void main(String[] args) {
        Plane plane1 = new Plane("Airbus A350", "White", 2012, 67, 225, 150000 );
        Plane plane2 = new Plane("Boing 747", "Silver", 2012, 68, 255, 198380);

        Plane.compare(plane1,plane2);

    }
}

class Plane {
    private String manufacturer;
    private String color;
    private int yearOfIssue;
    private int lengthOfPlane;
    private int weight;
    private int volumeOfTank;

    public Plane(String manufacturer, String color, int yearOfIssue, int lengthOfPlane, int weight, int volumeOfTank) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
        this.lengthOfPlane = lengthOfPlane;
        this.weight = weight;
        this.volumeOfTank = volumeOfTank;
    }
    public void info() {
        System.out.println("Это самолет марки " + manufacturer +
                ", год выпуска: " + yearOfIssue +
                ", длина: " + lengthOfPlane + " метров" +
                ", вес: " + weight + " тонн" +
                ", объем топливного бака: " + volumeOfTank + " литров");
    }

    public int getLengthOfPlane() {
        return this.lengthOfPlane;
        }

    static void compare (Plane plane1, Plane plane2) {
        if (plane1.getLengthOfPlane()>plane2.getLengthOfPlane()){
            System.out.println("Первый самолет длиннее второго");
        } else if (plane1.getLengthOfPlane()<plane2.getLengthOfPlane()){
            System.out.println("Второй самолет длиннее первого");
        } else {
            System.out.println("Самолеты одинаковой длины");}
    }
}