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
        if (strPiece.equals("King")) {
            return PieceType.KING.create();
        } else if (strPiece.equals("Queen")) {
            return PieceType.QUEEN.create();
        } else if (strPiece.equals("Bishop")) {
            return PieceType.BISHOP.create();
        } else if (strPiece.equals("Horse")) {
            return PieceType.HORSE.create();
        } else if (strPiece.equals("Rook")) {
            return PieceType.ROOK.create();
        } else if (strPiece.equals("Pawn")) {
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
