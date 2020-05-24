package io.game.pieces;

import java.util.ArrayList;

public class Rook extends Piece {

    @Override
    public ArrayList<Offset> getOffsets() {
        ArrayList<Offset> offsets = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            offsets.add(new Offset(0, i));
            offsets.add(new Offset(i, 0));
            offsets.add(new Offset(0, -i));
            offsets.add(new Offset(-i, 0));
        }

        return offsets;

    }
}
