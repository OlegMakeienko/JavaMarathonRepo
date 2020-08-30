package day6;


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

    public int yearDifference(int inputYear){ return Math.abs(inputYear - yearOfIssue); }

    public void info() {
        System.out.println("Это автомобиль " + model);
    }
}
