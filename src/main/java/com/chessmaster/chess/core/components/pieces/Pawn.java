package com.chessmaster.chess.core.components.pieces;

import java.util.List;

public class Pawn implements Piece {
	private Colour pieceColour;

	public Pawn(Colour colour) {
		this.setPieceColour(colour);
	}

	public PieceType getPieceType() {

		return PieceType.pawn;
	}

	public List<String> getListOfMoves() {
		return null;
	}

	public Boolean isValidMove() {
		return null;
	}

	public Colour getPieceColour() {
		return pieceColour;
	}

	public void setPieceColour(Colour pieceColour) {
		this.pieceColour = pieceColour;
	}

}
