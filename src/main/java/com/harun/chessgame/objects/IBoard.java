package com.harun.chessgame.objects;

import com.harun.chessgame.enums.PlayerType;

public interface IBoard {
    boolean isMoveable(Movement movement, PlayerType playerType);

    void doMovement(Movement movement);
    boolean controlWinGame(PlayerType playerType);
    void printBoard();
}
