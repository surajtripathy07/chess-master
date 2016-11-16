package com.chessmaster.chess.core.components.pieces;

import java.util.List;

public interface Piece {

	public enum Colour {
		black, white;
	}

	public enum PieceType {
		queen, king, rook, bishop, knight, pawn;
	}

	public Colour getPieceColour();

	public void setPieceColour(Colour pieceColour);

	public PieceType getPieceType();

	public List<String> getListOfMoves();

	public Boolean isValidMove();
}
