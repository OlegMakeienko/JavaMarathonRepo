package day17;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece figure1 = ChessPiece.PAWN_WHITE;
        ChessPiece figure2 = ChessPiece.PAWN_WHITE;
        ChessPiece figure3 = ChessPiece.PAWN_WHITE;
        ChessPiece figure4 = ChessPiece.PAWN_WHITE;

        ChessPiece figure5 = ChessPiece.ROOK_BLACK;
        ChessPiece figure6 = ChessPiece.ROOK_BLACK;
        ChessPiece figure7 = ChessPiece.ROOK_BLACK;
        ChessPiece figure8 = ChessPiece.ROOK_BLACK;

        System.out.println(figure1.toString());

      ChessPiece [] list = new ChessPiece[] {figure1, figure2, figure3, figure4,
      figure5, figure6, figure7, figure8};

        for (ChessPiece figure : list) {
            System.out.print(figure + " ");
        }

    }
}
