package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel( "Mercedes");
        car.setColor("White");
        car.setYearOfIssue(2004);

        Motorbike motorbike = new Motorbike("Suzuki", "White", 2012);

        car.info();
        motorbike.info();

        System.out.println("Твоему авто " + car.yearDifference( 2020) + " лет.");
        System.out.println("Твоему мотоциклу " + motorbike.yearDifference(2020)+ " лет.");
    }
}
