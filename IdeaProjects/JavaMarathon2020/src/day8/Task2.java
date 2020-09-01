package day8;

public class Task2 {
    public static void main(String[] args) {

        Plane plane = new Plane("AN 225 Мрія", "white", 1988, 84, 150, 300);
        System.out.println(plane.toString());

    }
}

    class Plane {
        private String manufacturer;
        private String color;
        private int yearOfIssue;
        private int lengthOfPlane;
        private int weight;
        private int volumeOfTank;
        private int volumeInTank;

        public Plane(String manufacturer, String color, int yearOfIssue, int lengthOfPlane, int weight, int volumeOfTank) {
            this.manufacturer = manufacturer;
            this.color = color;
            this.yearOfIssue = yearOfIssue;
            this.lengthOfPlane = lengthOfPlane;
            this.weight = weight;
            this.volumeOfTank = volumeOfTank;
            this.volumeInTank = 0;

        }
        public String toString(){
            return manufacturer + ", " + color + ", " + yearOfIssue + ", " + lengthOfPlane + " метра, " + weight + " тонн, " + volumeOfTank + " тысяч литров";
        }
    }