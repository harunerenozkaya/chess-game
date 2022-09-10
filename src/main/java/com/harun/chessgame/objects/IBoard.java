package com.harun.chessgame.objects;

import com.harun.chessgame.enums.PlayerType;

public interface IBoard {
    void movePiece(Movement movement, PlayerType playerType);

    boolean controlWinGame(PlayerType playerType);
}
