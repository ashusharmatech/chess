package io.game.pieces;

import java.util.ArrayList;

public class Queen extends Piece {

    @Override
    public ArrayList<Offset> getOffsets() {
        ArrayList<Offset> offsets = new ArrayList<>();
        Piece[] pieces = {
                PieceType.ROOK.create(),
                PieceType.BISHOP.create()
        };
        for (Piece piece : pieces) {
            offsets.addAll(piece.getOffsets());
        }
        return offsets;
    }
}
