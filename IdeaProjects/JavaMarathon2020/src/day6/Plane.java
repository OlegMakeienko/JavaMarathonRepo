package day6;

public class Plane {
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
    public void info() {
        System.out.println("Это самолет марки " + manufacturer +
                ", год выпуска: " + yearOfIssue +
                ", длина: " + lengthOfPlane + " метров" +
                ", вес: " + weight + " кг"+
                ", объем топливного бака: " +volumeOfTank + " литров");}

    public int fillUp(int fill){
        return volumeInTank += fill ;
                }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getLengthOfPlane() {
        return lengthOfPlane;
    }

    public void setLengthOfPlane(int lengthOfPlane) {
        this.lengthOfPlane = lengthOfPlane;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getVolumeOfTank() {
        return volumeOfTank;
    }

    public void setVolumeOfTank(int volumeOfTank) {
        this.volumeOfTank = volumeOfTank;
    }

    public int getVolumeInTank() {
        return volumeInTank;
    }

    public void setVolumeInTank(int volumeInTank) {
        this.volumeInTank = volumeInTank;
    }
}
