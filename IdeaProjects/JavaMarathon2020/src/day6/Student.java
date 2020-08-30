package day6;

public class Student {
    private String name;
    private String fathersName;
    private String surname;
    private int score;
    private String studentsFio;

    public Student(String name, String fathersName, String surname) {
        this.name = name;
        this.fathersName = fathersName;
        this.surname = surname;
        this.score = score;
        this.studentsFio = this.name +" "+ this.fathersName +" "+ this.surname;
    }

    public void info() {
        System.out.println("Ученик " + name + " " + fathersName + " " + surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getStudentsFio() {
        return studentsFio;
    }
}

