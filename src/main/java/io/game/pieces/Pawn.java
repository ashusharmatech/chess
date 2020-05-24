package io.game.pieces;

import java.util.ArrayList;

public class Pawn extends Piece {

    int[] row = new int[]{1};
    int[] col = new int[]{0};


    @Override
    public ArrayList<Offset> getOffsets() {
        ArrayList<Offset> offsets = new ArrayList<>();
        for (int i = 0; i < row.length; i++) {
            offsets.add(new Offset(row[i], col[i]));
        }
        return offsets;

    }
}
