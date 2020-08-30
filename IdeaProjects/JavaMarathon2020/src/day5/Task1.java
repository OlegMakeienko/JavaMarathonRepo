package day5;

public class Task1 {
    public static void main(String[] args) {


        Car car1 = new Car();
        car1.setModel("Volvo");
        car1.setColor("White");
        car1.setYearOfIssue(2004);
        System.out.println("Ваш автомобиль: "+ car1.getColor() + " " + car1.getModel() + " " + car1.getYearOfIssue() + " года выпуска");
    }

}




class Car {
    private String model;
    private String color;
    private int yearOfIssue;

    public void setModel(String userModel) {
        if (userModel.isEmpty()) {
            System.out.println("Введи марку авто");
        } else {
            model = userModel;
        }
    }
    public String getModel() {
        return model;
    }

    public void setColor(String userColor) {
        if (userColor.isEmpty()) {
            System.out.println("Введи цвет авто");
        } else {
            color = userColor;
        }
    }
    public String getColor() {
        return color;
    }

    public void setYearOfIssue(int userYearOfIssue) {
        if (userYearOfIssue <= 0) {
            System.out.println("Некорректный ввод года производства авто");
        } else {
            yearOfIssue = userYearOfIssue;
        }
    }
    public int getYearOfIssue(){
        return yearOfIssue;
    }
}