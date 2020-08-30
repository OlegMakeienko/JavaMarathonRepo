package day6;

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

    public int yearDifference(int inputYear){ return Math.abs(inputYear - yearOfIssue); }

    public void info() {
        System.out.println("Это мотоцикл");
    }
}