package io.game;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ChessboardTest {
    Chessboard chessboard = new Chessboard();

    @Test
    public void whenInvalidInputPositionThenShouldFail() {
        Assertions.assertNotNull(chessboard);
    }


}