package com.harun.chessgame.objects;

import com.harun.chessgame.enums.PieceType;
import com.harun.chessgame.enums.PlayerType;

public class Board implements IBoard{
    private Piece[] board;
    private boolean playerBlackIsChecked;
    private boolean playerWhiteIsChecked;

    public Board(Piece[] board,boolean playerBlackIsChecked,boolean playerWhiteIsChecked){
        this.board = board;
        this.playerBlackIsChecked = playerBlackIsChecked;
        this.playerWhiteIsChecked = playerWhiteIsChecked;
    }

    @Override
    public void movePiece(Movement movement, PlayerType playerType) {

    }


    private boolean controlMovement(Movement movement, PlayerType playerType) {
        return false;
    }


    private boolean controlWinGame(PlayerType playerType) {
        return false;
    }


    private boolean controlMovementByPieceType(Movement movement, PieceType pieceType) {
        return false;
    }


    private boolean controlMovementByPieceLocations(Movement movement) {
        return false;
    }


    private boolean controlPlayerIsCheck(PlayerType playerType) {
        return false;
    }
}
