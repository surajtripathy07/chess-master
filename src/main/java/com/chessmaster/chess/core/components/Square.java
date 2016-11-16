package com.chessmaster.chess.core.components;

import com.chessmaster.chess.core.components.pieces.Piece;

public class Square {

	public enum SquareColour {
		dark, light;
	}

	private Piece piece;

	private String position;

	private SquareColour Colour;

	private Long gameId;

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public SquareColour getColour() {
		return Colour;
	}

	public void setColour(SquareColour colour) {
		Colour = colour;
	}

	public Long getGameId() {
		return gameId;
	}

	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}

}
