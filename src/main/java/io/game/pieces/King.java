package io.game.pieces;

import java.util.ArrayList;

public class King extends Piece {

    int[] row = new int[]{-1, -1, -1, 0, 0, 1, 1, 1};
    int[] col = new int[]{-1, 0, 1, -1, 1, -1, 0, 1};


    @Override
    public ArrayList<Offset> getOffsets() {
        ArrayList<Offset> offsets = new ArrayList<>();
        for (int i = 0; i < row.length; i++) {
            offsets.add(new Offset(row[i], col[i]));
        }
        return offsets;

    }
}
