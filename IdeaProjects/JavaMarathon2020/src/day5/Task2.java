package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike("Kawasaki","Black",2010);

        System.out.println("Ваш мотоцикл: "+ motorbike1.getColorOfBike() + " " + motorbike1.getModelOfBike() + " " + motorbike1.getYearOfIssueOfBike() + " года выпуска");

    }
}

class Motorbike {
    private String model;
    private String color;
    private int yearOfIssue;

    public Motorbike(String model, String color, int yearOfIssue) {
        this.model = model;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
    }

    public String getModelOfBike() {
        return model;
    }


    public String getColorOfBike() {
        return color;
    }

    public int getYearOfIssueOfBike(){
        return yearOfIssue;
    }

}