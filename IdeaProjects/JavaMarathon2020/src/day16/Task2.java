package day16;

import java.io.File;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
Файл 2 создается на основании Файла 1, но содержит числа вещественного типа данных.
Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из
Файла 1 рассчитывается их среднее арифметическое. Затем, полученное значение записывается в Файл 2.
 Таким образом в Файле 2 будет находиться 50 вещественных чисел (1000 / 20 = 50).
После того, как Файл 2 будет сформирован, необходимо найти сумму всех вещественных чисел из
Файла 2 и вывести в консоль ответ, отбросив его вещественную часть.
Пример:
Для простоты, в Файле 1 находится 12 целых чисел, а среднее арифметическое
рассчитывается для группы из 4 целых чисел.

Файл 1: 3 8 7 5 28 73 4 1 5 32 89 12
Файл 2: 5.75 26.5 34.5
Ответ: 66

Комментарии к примеру:
Среднее арифметическое для четверки 3 8 7 5 равно 5.75
Таким же образом рассчитаны средние арифметические для остальных четверок из Файла 1.
Сумма вещественных чисел из Файла 2 равняется 66.75
Отбросив вещественную часть (числа после запятой) получаем ответ 66.

 */
public class Task2 {
    public static void main(String[] args) throws IOException {

//        int a = (int)(Math.random()*(100));      // просто вспоминал как находить рандомные числа
//        System.out.println(a);

        int [] array = new int [1000];
        for (int i=0; i<array.length; i++){
            array [i] = ((int)(Math.random() * 100));
        }
        System.out.println(Arrays.toString(array));       //  Итак, есть массив с тысячей рандомных чисел

        PrintWriter pw = new PrintWriter("randomMassiv");
        pw.println(Arrays.toString(array));

        pw.close();

        File file = new File("randomMassiv");
        Scanner s = new Scanner(file);
        String line = s.nextLine();
        String[] numbers = line.split(" ");

        // здесь нужен цикл из каждых 20 чисел получить ср.арифм. и вывести его в файл 2
        float sum = 0;
        for (String number : numbers)
            sum += Float.parseFloat(number);
        double x = sum/ numbers.length;

        // создать файл 2
        PrintWriter pw1 = new PrintWriter("arithmeticMean");
        pw1.println(Arrays.toString(array));



        File file1 = new File("arithmeticMean");
        Scanner s1 = new Scanner(file1);
        String line1 = s.nextLine();
        String[] numbers1 = line1.split(" ");

        float sum2 = 0;
        for (String number : numbers1)
            sum2 += Float.parseFloat(number);
        double y = sum2/ numbers1.length;


        System.out.println(y);

        pw1.close();
        pw.close();
        s.close();
        s1.close();

    }
}



