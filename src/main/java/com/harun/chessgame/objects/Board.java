package com.harun.chessgame.objects;

import com.harun.chessgame.enums.PieceColor;
import com.harun.chessgame.enums.PieceType;
import com.harun.chessgame.enums.PlayerType;

public class Board implements IBoard{
    private Piece[][] board;
    private boolean playerBlackIsChecked = false;
    private boolean playerWhiteIsChecked = false;

    public Board(){
        board = new Piece[8][8];

        board[0][0] = new Piece(PieceColor.BlackPiece,PieceType.Rook);
        board[0][1] = new Piece(PieceColor.BlackPiece,PieceType.Knight);
        board[0][2] = new Piece(PieceColor.BlackPiece,PieceType.Bishop);
        board[0][3] = new Piece(PieceColor.BlackPiece,PieceType.Queen);
        board[0][4] = new Piece(PieceColor.BlackPiece,PieceType.King);
        board[0][5] = new Piece(PieceColor.BlackPiece,PieceType.Bishop);
        board[0][6] = new Piece(PieceColor.BlackPiece,PieceType.Knight);
        board[0][7] = new Piece(PieceColor.BlackPiece,PieceType.Rook);

        board[1][0] = new Piece(PieceColor.BlackPiece,PieceType.Pawn);
        board[1][1] = new Piece(PieceColor.BlackPiece,PieceType.Pawn);
        board[1][2] = new Piece(PieceColor.BlackPiece,PieceType.Pawn);
        board[1][3] = new Piece(PieceColor.BlackPiece,PieceType.Pawn);
        board[1][4] = new Piece(PieceColor.BlackPiece,PieceType.Pawn);
        board[1][5] = new Piece(PieceColor.BlackPiece,PieceType.Pawn);
        board[1][6] = new Piece(PieceColor.BlackPiece,PieceType.Pawn);
        board[1][7] = new Piece(PieceColor.BlackPiece,PieceType.Pawn);

        board[2][0] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[2][1] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[2][2] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[2][3] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[2][4] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[2][5] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[2][6] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[2][7] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);

        board[3][0] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[3][1] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[3][2] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[3][3] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[3][4] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[3][5] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[3][6] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[3][7] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);

        board[4][0] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[4][1] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[4][2] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[4][3] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[4][4] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[4][5] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[4][6] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[4][7] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);

        board[5][0] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[5][1] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[5][2] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[5][3] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[5][4] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[5][5] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[5][6] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);
        board[5][7] = new Piece(PieceColor.EmptyPiece,PieceType.Empty);

        board[6][0] = new Piece(PieceColor.WhitePiece,PieceType.Pawn);
        board[6][1] = new Piece(PieceColor.WhitePiece,PieceType.Pawn);
        board[6][2] = new Piece(PieceColor.WhitePiece,PieceType.Pawn);
        board[6][3] = new Piece(PieceColor.WhitePiece,PieceType.Pawn);
        board[6][4] = new Piece(PieceColor.WhitePiece,PieceType.Pawn);
        board[6][5] = new Piece(PieceColor.WhitePiece,PieceType.Pawn);
        board[6][6] = new Piece(PieceColor.WhitePiece,PieceType.Pawn);
        board[6][7] = new Piece(PieceColor.WhitePiece,PieceType.Pawn);

        board[7][0] = new Piece(PieceColor.WhitePiece,PieceType.Rook);
        board[7][1] = new Piece(PieceColor.WhitePiece,PieceType.Knight);
        board[7][2] = new Piece(PieceColor.WhitePiece,PieceType.Bishop);
        board[7][3] = new Piece(PieceColor.WhitePiece,PieceType.Queen);
        board[7][4] = new Piece(PieceColor.WhitePiece,PieceType.King);
        board[7][5] = new Piece(PieceColor.WhitePiece,PieceType.Bishop);
        board[7][6] = new Piece(PieceColor.WhitePiece,PieceType.Knight);
        board[7][7] = new Piece(PieceColor.WhitePiece,PieceType.Rook);
    }

    @Override
    public void movePiece(Movement movement, PlayerType playerType) {
        System.out.println(movement);
    }
    @Override
    public boolean controlWinGame(PlayerType playerType) {
        return false;
    }

    private boolean controlMovement(Movement movement, PlayerType playerType) {
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
