package Arrays;

public class Field {
    public static void main(String[] args) {
        int [][] battleField = new int [10][10];
        for (int x = 0; x < battleField.length; x++){ // идем по строкам

            for (int y = 0; y < battleField.length; y++){ // идем по столбцам

                System.out.print (" " + battleField[x][y] + " ");
            }

            System.out.println(); // после прохода одного цикла по строке - перенос строки
        }


        System.out.println();
        System.out.println();

        String [][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W " + chessBoardCoord(j,i);
                else chessBoard[i][j] = "B "+ chessBoardCoord(j,i);
            }
        }

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                System.out.print(" " + chessBoard[i][j] + " ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static String chessBoardCoord(int a, int b) {
        String letters = "abcdefgh";
        String numbers = "87654321";
        if ((a > 7)|| (b>7)) return null; //если номер за пределами доски,
                                          // возвращаем значение по умолчанию - null
        else return (Character.toString(letters.charAt(a)) + numbers.charAt(b)); /*charAt - метод, с помощью которого
                                        мы извлекаем из строки элемент под переданным номером,
                                        здесь - под номерами a и b. Character.toString - метод,
                                        который переводит полученный символ в строку*/
    }
}
