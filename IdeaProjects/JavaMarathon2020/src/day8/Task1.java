package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int s = 1;
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < 20000; i++) {
            sb.append(s + " ");
            s++;
        }
        System.out.println(sb.toString());

        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");


    }

}
