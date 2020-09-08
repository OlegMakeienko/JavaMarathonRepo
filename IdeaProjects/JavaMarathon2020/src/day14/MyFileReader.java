package day14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class myFileReader {
        public static void main(String[] args) {

            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader("myNumbers.txt"));
                String line;
                while ((line=br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Файл не найден");
        }
    }
}
