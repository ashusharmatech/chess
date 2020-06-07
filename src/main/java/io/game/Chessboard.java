package io.game;

import io.game.pieces.Piece;
import io.game.pieces.PieceType;

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
        try {
            parseInput(input);
            findAllNextPositions(piece, position);
        } catch (IllegalArgumentException e) {
            System.out.println("Not a valid input Position");
        }
    }


    public static void parseInput(String input) throws IllegalArgumentException {
        if (input != null && input.length() == 2) {
            String[] arr = input.split(" ");
            piece = parsePiece(arr[0]);
            position = new Position(arr[1]);
        } else {
            throw new IllegalArgumentException("Invalid Input");
        }


    }

    public static Piece parsePiece(String strPiece) throws IllegalArgumentException {
        if ("King".equals(strPiece)) {
            return PieceType.KING.create();
        } else if ("Queen".equals(strPiece)) {
            return PieceType.QUEEN.create();
        } else if ("Bishop".equals(strPiece)) {
            return PieceType.BISHOP.create();
        } else if ("Horse".equals(strPiece)) {
            return PieceType.HORSE.create();
        } else if ("Rook".equals(strPiece)) {
            return PieceType.ROOK.create();
        } else if ("Pawn".equals(strPiece)) {
            return PieceType.PAWN.create();
        } else {
            throw new IllegalArgumentException("Invalid Input");
        }
    }


    public static List<String> findAllNextPositions(Piece piece, Position position) {
        Set<Position> possibleMoves = piece.getPossibleMoves(position);
        return possibleMoves.stream().map(p -> p.toString()).collect(Collectors.toList());
    }
}
