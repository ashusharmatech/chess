package io.game;

import io.game.pieces.Piece;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Chessboard {

    private static Piece piece;
    private static Position position;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        process(br.readLine());
        br.close();
    }

    public static void process(String input) {

    }


    public static List<String> findAllNextPositions(Piece piece, Position position) {
        Set<Position> possibleMoves = piece.getPossibleMoves(position);
        return possibleMoves.stream().map(p -> p.toString()).collect(Collectors.toList());
    }
}
