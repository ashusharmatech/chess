package io.game;

import io.game.pieces.Offset;

public class Position {
    private static final char A = 'A';
    private static final char H = 'H';
    private char column;
    private int row;

    public Position(char column, int row) {
        this.column = column;
        this.row = row;
    }

    public Position(String position) {
        if (position != null && position.length() == 2) {
            this.column = position.charAt(0);
            this.row = Integer.parseInt(String.valueOf(position.charAt(1)));
        }
    }


    public Position getNewPosition(Offset offset) {
        int newRow = this.row + offset.getRow();
        char newCol = (char) (this.column + offset.getColumn());
        if (newCol >= A && newCol <= H && newRow >= 1 && newRow <= 8) {
            return new Position(newCol, newRow);
        }
        return null;
    }

    @Override
    public String toString() {
        return String.valueOf(column) + row;
    }
}
