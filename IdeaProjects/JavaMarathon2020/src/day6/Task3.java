package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Bob", "Norval", "Marley", "Music");
        teacher.info();

        Student student = new Student("Ruut", "N", "Gullit");
        student.info();

        teacher.evaluate(student);

    }
}
