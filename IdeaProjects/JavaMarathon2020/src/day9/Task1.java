package day9;

public class Task1 {
    public static void main(String[] args) {
        Human human = new Human("Max");
        human.printInfo();

        Student student = new Student("Oleg", "Java");
        student.printInfo();

        Teacher teacher = new Teacher("Sergei", "Teacher of Java");
        teacher.printInfo();
    }
}

class Human{
    String name;
    public void printInfo() {
        System.out.println("Этот человек с именем " + name);
    }
    public Human(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Student extends Human {
    private String studyGroup;


    public Student (String name, String studyGroup){
        super(name);
        this.studyGroup = studyGroup;
    }
    public String getStudyGroup() {
        return studyGroup;
    }
    public void setStudyGroup(String studyGroup) {
        this.studyGroup = studyGroup;
    }
    public void printInfo() {
        super.printInfo();
        System.out.println("Это студент с именем " + getName());
    }
}

class Teacher extends Human {
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void printInfo() {
        super.printInfo();
        System.out.println("Это преподаватель с именем " + getName());
    }
}