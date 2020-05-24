package io.game.pieces;

import java.util.ArrayList;

public class Bishop extends Piece {

    @Override
    public ArrayList<Offset> getOffsets() {
        ArrayList<Offset> offsets = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            offsets.add(new Offset(-i, -i));
            offsets.add(new Offset(i, i));
            offsets.add(new Offset(i, -i));
            offsets.add(new Offset(-i, i));
        }
        return offsets;

    }
}
