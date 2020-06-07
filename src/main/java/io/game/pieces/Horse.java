package io.game.pieces;

import java.util.ArrayList;

public class Horse extends Piece {

    private int[] row = {2, 1, -1, -2, -2, -1, 1, 2};
    private int[] col = {1, 2, 2, 1, -1, -2, -2, -1};

    @Override
    public ArrayList<Offset> getOffsets() {
        ArrayList<Offset> offsets = new ArrayList<>();
        for (int i = 0; i < row.length; i++) {
            offsets.add(new Offset(row[i], col[i]));
        }
        return offsets;

    }

}
