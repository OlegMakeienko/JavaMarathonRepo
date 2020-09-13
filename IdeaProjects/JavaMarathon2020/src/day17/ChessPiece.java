package day17;

public enum ChessPiece {
    KING_WHITE ("Король белый","♔",100), QUEEN_WHITE ("Ферзь белая","♕",9),
    ROOK_WHITE ("Ладья белая","♖",5), BISHOP_WHITE ("Слон белый","♗",3.5f),
    HORS_WHITE ("Лошадь белая","♘",3), PAWN_WHITE ("Пешка белая","♙",1),

    KING_BLACK ("Король черный","♚",100), QUEEN_BLACK ("Ферзь черная","♛",9),
    ROOK_BLACK ("Ладья черная","♜",5), BISHOP_BLACK ("Слон черный","♝",3.5f),
    HORS_BLACK ("Лошадь черная","♞", 3), PAWN_BLACK ("Пешка черная","♟",1),
    EMPTY("Пустая клетка", "_", -1);

    private final float value;
    private final String nameAvFigure;
    private final String TYPE;

    ChessPiece( String name, String type, float value) {
        this.value = value;
        this.nameAvFigure = name;
        TYPE = type;
    }

    @Override
    public String toString() {
        return TYPE;
    }

    public String getTYPE() {
        return TYPE;
    }
}
