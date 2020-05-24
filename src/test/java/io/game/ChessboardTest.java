package io.game;


import io.game.pieces.PieceType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.hasItems;

@DisplayName("Chessboard all possible move test cases.")
public class ChessboardTest {
    Chessboard chessboard = new Chessboard();

    @Test
    @DisplayName("When Chessboard Initialized. expected Ok")
    public void whenChessboardInitialize() {
        Assertions.assertNotNull(chessboard);
    }

    @Test
    @DisplayName("When King has all 8 directions for next moves. expected Ok")
    public void whenKingHasAll8DirectionMoves() {
        final List<String> nextPositions = chessboard.findAllNextPositions(PieceType.KING.create(), new Position("D5"));

        assertThat(nextPositions, hasSize(8));
        assertThat(nextPositions, hasItems("C6", "D6", "E6", "E5", "E4", "D4", "C4", "C5"));
    }

    @Test
    @DisplayName("When King current position at corner. expected Ok")
    public void whenKingAtCorner() {
        final List<String> nextPositions = chessboard.findAllNextPositions(PieceType.KING.create(), new Position("H1"));

        assertThat(nextPositions, hasSize(3));
        assertThat(nextPositions, hasItems("G1", "G2", "H2"));
    }

    @Test
    @DisplayName("When King current position at edge. expected Ok")
    public void whenKingAtEdge() {
        final List<String> nextPositions = chessboard.findAllNextPositions(PieceType.KING.create(), new Position("H4"));

        assertThat(nextPositions, hasSize(5));
        assertThat(nextPositions, hasItems("H5", "G5", "G4", "G3", "H3"));
    }

    @Test
    @DisplayName("When Pawn is at center. expected Ok")
    public void whenPawnIsInCenter() {
        final List<String> nextPositions = chessboard.findAllNextPositions(PieceType.PAWN.create(), new Position("D4"));

        assertThat(nextPositions, hasSize(1));
        assertThat(nextPositions, hasItems("D5"));
    }

    @Test
    @DisplayName("When Pawn is at top and can't move. expected blank")
    public void whenPawnAtTop() {
        final List<String> nextPositions = chessboard.findAllNextPositions(PieceType.PAWN.create(), new Position("D8"));

        assertThat(nextPositions, is(empty()));
    }

    @Test
    @DisplayName("When Horse has all 8 directions to move. expected Null")
    public void whenHorseHasAll8DirectionMoves() {
        final List<String> nextPositions = chessboard.findAllNextPositions(PieceType.HORSE.create(), new Position("E3"));

        assertThat(nextPositions, hasSize(8));
        assertThat(nextPositions, hasItems("D5", "F5", "G4", "G2", "F1", "D1", "C2", "C4"));
    }

    @Test
    @DisplayName("When Horse at the edge can move 4 directions. expected Ok")
    public void whenHorseAtEdge() {
        final List<String> nextPositions = chessboard.findAllNextPositions(PieceType.HORSE.create(), new Position("A4"));

        assertThat(nextPositions, hasSize(4));
        assertThat(nextPositions, hasItems("B6", "C5", "C3", "B2"));
    }

    @Test
    @DisplayName("When Horse at the near to edge. expected Ok")
    public void whenHorseHas6ValidMoves() {
        final List<String> nextPositions = chessboard.findAllNextPositions(PieceType.HORSE.create(), new Position("B3"));

        assertThat(nextPositions, hasSize(6));
        assertThat(nextPositions, hasItems("A5", "C5", "D4", "D2", "A1", "C1"));
    }

    @Test
    @DisplayName("When Rook has 4 directions to move. expected Ok")
    public void whenRookHas4ValidDirections() {
        final List<String> nextPositions = chessboard.findAllNextPositions(PieceType.ROOK.create(), new Position("D5"));

        assertThat(nextPositions, hasSize(14));
        assertThat(nextPositions, hasItems("B5", "D6", "F5", "C5", "G5", "D7", "H5", "D1", "D3", "D4", "D8", "D2", "A5", "E5"));
    }

    @Test
    @DisplayName("When Rook at the corner. expected Ok")
    public void whenRookAtCorner() {
        final List<String> nextPositions = chessboard.findAllNextPositions(PieceType.ROOK.create(), new Position("A1"));

        assertThat(nextPositions, hasSize(14));
        assertThat(nextPositions, hasItems("E1", "A2", "D1", "C1", "F1", "A4", "H1", "A8", "A5", "A3", "A6", "A7", "G1", "B1"));
    }

    @Test
    @DisplayName("When Rook at the edge. expected Ok")
    public void whenRookNearBorder() {
        final List<String> nextPositions = chessboard.findAllNextPositions(PieceType.ROOK.create(), new Position("B2"));

        assertThat(nextPositions, hasSize(14));
        assertThat(nextPositions, hasItems("B8", "H2", "D2", "B5", "B1", "B4", "C2", "F2", "B6", "E2", "B7", "B3", "G2", "A2"));
    }

    @Test
    @DisplayName("When Bishop has 4 directions to moves. expected Ok")
    public void whenBishopHas4DirectionsToMove() {
        final List<String> nextPositions = chessboard.findAllNextPositions(PieceType.BISHOP.create(), new Position("D5"));

        assertThat(nextPositions, hasSize(13));
        assertThat(nextPositions, hasItems("B7", "E6", "B3", "C6", "A2", "F7", "H1", "F3", "E4", "G8", "G2", "A8", "C4"));
    }

    @Test
    @DisplayName("When Bishop at edge. expected Ok")
    public void whenBishopAtEdge() {
        final List<String> nextPositions = chessboard.findAllNextPositions(PieceType.BISHOP.create(), new Position("A7"));

        assertThat(nextPositions, hasSize(7));
        assertThat(nextPositions, hasItems("G1", "B6", "E3", "C5", "D4", "F2", "B8"));
    }

    @Test
    @DisplayName("When Queen has all 8 direction to move. expected Ok")
    public void whenQueenHasAllDirectionsToMove() {
        final List<String> nextPositions = chessboard.findAllNextPositions(PieceType.QUEEN.create(), new Position("E4"));

        assertThat(nextPositions, hasSize(27));
        assertThat(nextPositions, hasItems("G4", "A8", "D4", "F4", "G6", "E3", "H1", "C6", "E5", "B1", "F3", "H4", "B7", "D3", "C2", "C4", "G2", "E8", "B4", "D5", "E1", "E6", "H7", "A4", "E2", "E7", "F5"));
    }

    @Test
    @DisplayName("When Queen at edge. expected Ok")
    public void whenQueenAtEdge() {
        final List<String> nextPositions = chessboard.findAllNextPositions(PieceType.QUEEN.create(), new Position("A3"));

        assertThat(nextPositions, hasSize(21));
        assertThat(nextPositions, hasItems("A5", "A2", "B4", "B3", "D6", "E7", "D3", "C3", "G3", "F3", "C5", "F8", "A8", "A1", "H3", "A4", "A6", "A7", "B2", "C1", "E3"));
    }

    @Test
    @DisplayName("When Queen at corner. expected Ok")
    public void whenQueenAtCorner() {
        final List<String> nextPositions = chessboard.findAllNextPositions(PieceType.QUEEN.create(), new Position("H8"));

        assertThat(nextPositions, hasSize(21));
        assertThat(nextPositions, hasItems("E8","H2","F8","F6","A8","B2","C3","H3","C8","E5","G7","A1","B8","H1","D8","G8","D4","H7","H4","H5","H6"));
    }


}