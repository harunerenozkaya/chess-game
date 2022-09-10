package com.harun.chessgame.objects;

import com.harun.chessgame.enums.PlayerType;

public interface IBoard {
    boolean movePiece(Movement movement, PlayerType playerType);
    boolean controlWinGame(PlayerType playerType);
    void printBoard();
}
