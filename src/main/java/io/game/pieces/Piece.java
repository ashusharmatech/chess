package io.game.pieces;

import io.game.Position;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Piece {

    public abstract List<Offset> getOffsets();

    public Set<Position> getPossibleMoves(Position position) {
        List<Offset> offsets = getOffsets();
        Set<Position> result = new HashSet<>();
        for (int i = 0; i < offsets.size(); i++) {
            Position newPosition = position.getNewPosition(offsets.get(i));
            if(newPosition!=null) {
                result.add(newPosition);
            }
        }
        return result;
    }

}
