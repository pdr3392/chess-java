package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {
  private final Color color;
  private Integer moveCount;

  public ChessPiece(Board board, Color color) {
    super(board);
    moveCount = 0;
    this.color = color;
  }

  public int getMoveCount() {
    return moveCount;
  }

  public void increaseMoveCount() {
    moveCount++;
  }

  public void decreaseMoveCount() {
    moveCount--;
  }

  public Color getColor() {
    return color;
  }

  public ChessPosition getChessPosition() {
    return ChessPosition.fromPosition(position);
  }

  protected boolean isThereOpponentPiece(Position position) {
    ChessPiece p = (ChessPiece) getBoard().piece(position);

    return p != null && p.getColor() != color;
  }
}
