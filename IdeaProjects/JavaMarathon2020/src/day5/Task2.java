package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike();
        motorbike1.setModelOfBike("Kawasaki");
        motorbike1.setColorOfBike("Black");
        motorbike1.setYearOfIssueOfBike(2010);
        System.out.println("Ваш мотоцикл: "+ motorbike1.getColorOfBike() + " " + motorbike1.getModelOfBike() + " " + motorbike1.getYearOfIssueOfBike() + " года выпуска");

    }
}

class Motorbike {
    private String model;
    private String color;
    private int yearOfIssue;

    public void setModelOfBike(String model) {
        if (model.isEmpty()) {
            System.out.println("Введи марку авто");
        } else {
            this.model = model;
        }
    }
    public String getModelOfBike() {
        return model;
    }

    public void setColorOfBike(String color) {
        if (color.isEmpty()) {
            System.out.println("Введи цвет авто");
        } else {
            this.color = color;
        }
    }
    public String getColorOfBike() {
        return color;
    }

    public void setYearOfIssueOfBike(int yearOfIssue) {
        if (yearOfIssue <= 0) {
            System.out.println("Некорректный ввод года производства авто");
        } else {
            this.yearOfIssue = yearOfIssue;
        }
    }
    public int getYearOfIssueOfBike(){
        return yearOfIssue;
    }

}