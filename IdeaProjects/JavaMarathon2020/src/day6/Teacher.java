package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String fathersName;
    private String surname;
    private String subject;
    private String fio;

    public Teacher(String name, String fathersName, String surname, String subject) {
        this.name = name;
        this.fathersName = fathersName;
        this.surname = surname;
        this.subject = subject;
        this.fio = this.name +" "+ this.fathersName +" "+ this.surname;
    }
    public void info() {               // метод инфо создал исключительно как промежуточный, для проверки, что все работает
        System.out.println("Учитель " + name + " " + fathersName + " " + surname + " преподает " + subject);
    }

    public void evaluate(Student student){
        Random random = new Random();
        int randomValue = random.nextInt(4)+2;

        String evaluation = "";         // конечно этот метод пришлось подглядеть в решении ;)
        switch (randomValue) {
            case 2:
                evaluation = "неуд";
                    break;
            case 3:
                evaluation = "так себе";
                    break;
            case 4:
                evaluation = "хорошо";
                    break;
            case 5:
                evaluation = "отлично";
                    break;

        }

        System.out.println("Преподаватель " + this.fio +
                " оценил студента " + student.getStudentsFio() +
                " по предмету " + this.subject + " на оценку " + "''" + evaluation + "''"+ ".");

    }
}
