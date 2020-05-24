package io.game.pieces;

public enum PieceType {

    PAWN() {
        @Override
        public Pawn create() {
            return new Pawn();
        }
    }, ROOK() {
        @Override
        public Rook create() {
            return new Rook();
        }
    }, HORSE() {
        @Override
        public Horse create() {
            return new Horse();
        }
    }, BISHOP() {
        @Override
        public Bishop create() {
            return new Bishop();
        }
    }, QUEEN() {
        @Override
        public Queen create() {
            return new Queen();
        }
    }, KING() {
        @Override
        public King create() {
            return new King();
        }
    };

    public abstract Piece create();

}
