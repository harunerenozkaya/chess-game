package com.harun.chessgame.objects;

import com.harun.chessgame.enums.PieceColor;
import com.harun.chessgame.enums.PieceType;
import com.harun.chessgame.enums.PlayerType;

public class Board implements IBoard{
    private Piece[][] board;

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
    public boolean movePiece(Movement movement, PlayerType playerType) {
        if(!controlMovement(movement,playerType))
            return false;

        doMovement(movement);
        return true;
    }

    @Override
    public boolean controlWinGame(PlayerType playerType) {
        return false;
    }

    @Override
    public void printBoard() {
        System.out.println("   ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
        for(int i=0; i<8; i++){
            System.out.print(" " + (i+1) + " ");
            for(int j=0; j<8; j++){
                System.out.print("⎪ " + board[i][j].getIcon() + " ");
            }
            System.out.print("⎪\n");
            System.out.println("   ⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
        }
        System.out.println("     a   b   c   d   e   f   g   h");
        System.out.print("\n\n");
    }

    private boolean controlMovement(Movement movement,PlayerType playerType) {
        return  controlMovementByPlayerType(movement,playerType) &&
                controlMovementByPieceType(movement,playerType) &&
                controlMovementByPieceLocations(movement,playerType) &&
                controlMovementByKingCheckedIfDoneMovement(movement,playerType);
    }


    private boolean controlMovementByPlayerType(Movement movement,PlayerType playerType){
        PieceColor sourcePieceColor = board[movement.getSourceY()][movement.getSourceX()].getColor();

        //White player can not move black pieces or vice a versa and empty pieces can not be moved
        return (playerType != PlayerType.WhitePlayer || sourcePieceColor != PieceColor.BlackPiece) &&
                (playerType != PlayerType.BlackPlayer || sourcePieceColor != PieceColor.WhitePiece);
    }

    private boolean controlMovementByPieceType(Movement movement,PlayerType playerType) {
        PieceType sourcePieceType = board[movement.getSourceY()][movement.getSourceX()].getType();

        switch (sourcePieceType){
            //Rook can move just horizontal or vertical
            case Rook:
                return movement.getSourceX() == movement.getTargetX() || movement.getSourceY() == movement.getTargetY();
            //Knight can move just like L
            case Knight:
                return Math.abs(movement.getTargetX()-movement.getSourceX()) == 1 && Math.abs(movement.getTargetY()-movement.getSourceY()) == 2 ||
                        Math.abs(movement.getTargetY()-movement.getSourceY()) == 1 && Math.abs(movement.getTargetX()-movement.getSourceX()) == 2;
            //Bishop can move in any direction diagonally
            case Bishop:
                return Math.abs(movement.getTargetX() - movement.getSourceX()) == Math.abs(movement.getTargetY() - movement.getSourceY());
            //Queen can move any direction
            case Queen:
                return movement.getSourceX() == movement.getTargetX() || movement.getSourceY() == movement.getTargetY() ||
                        Math.abs(movement.getTargetX() - movement.getSourceX()) == Math.abs(movement.getTargetY() - movement.getSourceY());
            //King can move one block distance to every direction
            case King:
                return  movement.getTargetY() == movement.getSourceY() && Math.abs(movement.getTargetX() - movement.getSourceX()) == 1 ||
                        movement.getTargetX() == movement.getSourceX() && Math.abs(movement.getTargetY() - movement.getSourceY()) == 1 ||
                        Math.abs(movement.getTargetX()-movement.getSourceX()) == 1 && Math.abs(movement.getTargetY()-movement.getSourceY()) == 1;
            //Pawn can move just 1 forward step
            case Pawn:
                if(playerType == PlayerType.WhitePlayer){
                    if(movement.getSourceY() == 6){
                        return  movement.getSourceY()-movement.getTargetY() <= 2 && movement.getSourceX() == movement.getTargetX() ||
                                movement.getSourceY()-movement.getTargetY() == 1 && movement.getSourceX() != movement.getTargetX() &&
                                board[movement.getTargetY()][movement.getTargetX()].getType() != PieceType.Empty;
                    }
                    else
                        return  movement.getSourceY()-movement.getTargetY() == 1 && movement.getSourceX() == movement.getTargetX() ||
                                movement.getSourceY()-movement.getTargetY() == 1 && movement.getSourceX() != movement.getTargetX() &&
                                board[movement.getTargetY()][movement.getTargetX()].getType() != PieceType.Empty;
                }
                else if(playerType == PlayerType.BlackPlayer){
                    if(movement.getSourceY() == 1){
                        return  movement.getTargetY()-movement.getSourceY() <= 2 && movement.getSourceX() == movement.getTargetX() ||
                                movement.getTargetY()-movement.getSourceY() == 1 && movement.getSourceX() != movement.getTargetX() &&
                                board[movement.getTargetY()][movement.getTargetX()].getType() != PieceType.Empty;
                    }
                    else{
                        return  movement.getTargetY()-movement.getSourceY() == 1 && movement.getSourceX() == movement.getTargetX() ||
                                movement.getTargetY()-movement.getSourceY() == 1 && movement.getSourceX() != movement.getTargetX() &&
                                board[movement.getTargetY()][movement.getTargetX()].getType() != PieceType.Empty;}
                }
            case Empty:
                return false;
        }

        return false;
    }

    private boolean controlMovementByPieceLocations(Movement movement,PlayerType playerType) {
        PieceType sourcePieceType = board[movement.getSourceY()][movement.getSourceX()].getType();
        PieceColor playerPieceColor;

        //Find player type
        if(playerType == PlayerType.WhitePlayer)
            playerPieceColor = PieceColor.WhitePiece;
        else
            playerPieceColor = PieceColor.BlackPiece;

        //If target piece has same color with player pieces
        if(board[movement.getTargetY()][movement.getTargetX()].getColor() == playerPieceColor)
            return false;

        //Convert Queen to Rook or Bishop
        if(sourcePieceType == PieceType.Queen){
            //Rook
            if(movement.getSourceX() == movement.getTargetX() || movement.getSourceY() == movement.getTargetY()){
                sourcePieceType = PieceType.Rook;
            }
            else{
                sourcePieceType = PieceType.Bishop;
            }
        }

        switch (sourcePieceType){
            //There must not be a piece on rook path.
            case Rook:
                //Vertical movement
                if(movement.getSourceX() == movement.getTargetX()){
                    //To Up
                    if(movement.getSourceY() > movement.getTargetY()){
                        for(int y=movement.getSourceY()-1; y>movement.getTargetY(); y--){
                            if(board[y][movement.getSourceX()].getColor() != PieceColor.EmptyPiece)
                                return false;
                        }
                    }
                    //To Down
                    else{
                        for(int y=movement.getSourceY()+1; y<movement.getTargetY(); y++){
                            if(board[y][movement.getSourceX()].getColor() != PieceColor.EmptyPiece)
                                return false;
                        }
                    }
                    return true;
                }
                //Horizontal movement
                else if(movement.getSourceY() == movement.getTargetY()){
                    //To Left
                    if(movement.getSourceX() > movement.getTargetX()){
                        for(int x=movement.getSourceX()-1; x>movement.getTargetX(); x--){
                            if(board[movement.getSourceY()][x].getColor() != PieceColor.EmptyPiece)
                                return false;
                        }
                    }
                    //To Right
                    else{
                        for(int x=movement.getSourceX()+1; x<movement.getTargetX(); x++){
                            if(board[movement.getSourceY()][x].getColor() != PieceColor.EmptyPiece)
                                return false;
                        }
                    }
                    return true;
                }

            //Knight can move on other pieces
            case Knight:
                return true;

            //There must not be a piece on bishop's diagonals path.
            case Bishop:
                //right-down corner
                if(movement.getSourceX() < movement.getTargetX() && movement.getSourceY() < movement.getTargetY()){
                    for(int x = movement.getSourceX()+1, y = movement.getSourceY()+1; x < movement.getTargetX() && y < movement.getTargetY(); x++ , y++){
                        if(board[y][x].getColor() != PieceColor.EmptyPiece)
                            return false;
                    }
                }
                //right-top corner
                else if(movement.getSourceX() < movement.getTargetX() && movement.getSourceY() > movement.getTargetY()){
                    for(int x = movement.getSourceX()+1, y = movement.getSourceY()-1; x < movement.getTargetX() && y > movement.getTargetY(); x++ , y--){
                        if(board[y][x].getColor() != PieceColor.EmptyPiece)
                            return false;
                    }
                }
                //left-down
                else if(movement.getSourceX() > movement.getTargetX() && movement.getSourceY() < movement.getTargetY()){
                    for(int x = movement.getSourceX()-1, y = movement.getSourceY()+1; x > movement.getTargetX() && y < movement.getTargetY(); x-- , y++){
                        if(board[y][x].getColor() != PieceColor.EmptyPiece)
                            return false;
                    }
                }
                //left-top
                else if(movement.getSourceX() > movement.getTargetX() && movement.getSourceY() > movement.getTargetY()){
                    for(int x = movement.getSourceX()-1, y = movement.getSourceY()-1; x > movement.getTargetX() && y > movement.getTargetY(); x-- , y--){
                        if(board[y][x].getColor() != PieceColor.EmptyPiece)
                            return false;
                    }
                }
                return true;

            //King can move just 1 move so always true
            case King:
                return  true;

            //Pawn can't go straight if there is any pawn in front of it.
            case Pawn:
                //If pawn goes to diagonal so it can
                if(movement.getSourceX() == movement.getTargetX()){
                    if(playerType == PlayerType.WhitePlayer){
                        if(movement.getSourceY()-movement.getTargetY() == 2 &&
                                board[movement.getTargetY()+1][movement.getTargetX()].getType() != PieceType.Empty ||
                                board[movement.getTargetY()][movement.getTargetX()].getType() != PieceType.Empty)
                            return false;
                        else if(movement.getSourceY()-movement.getTargetY() == 1 &&
                                board[movement.getTargetY()][movement.getTargetX()].getType() != PieceType.Empty)
                            return false;
                    }
                    else if(playerType == PlayerType.BlackPlayer){
                        if(movement.getTargetY()-movement.getSourceY() == 2 &&
                                board[movement.getTargetY()-1][movement.getTargetX()].getType() != PieceType.Empty ||
                                board[movement.getTargetY()][movement.getTargetX()].getType() != PieceType.Empty)
                            return false;
                        else if(movement.getTargetY()-movement.getSourceY() == 1 &&
                                board[movement.getTargetY()][movement.getTargetX()].getType() != PieceType.Empty)
                            return false;
                    }
                }
                return true;
        }

        return false;
    }

    private boolean controlMovementByKingCheckedIfDoneMovement(Movement movement, PlayerType playerType) {
        Piece targetPiece = board[movement.getTargetY()][movement.getTargetX()];
        doMovement(movement);

        if(controlPlayerIsChecked(playerType)){
            undoMovement(movement,targetPiece);
            return false;
        }
        else{
            undoMovement(movement,targetPiece);
            return true;
        }
    }

    private boolean controlPlayerIsChecked(PlayerType playerType) {
        int kingX = 0,kingY = 0;
        PieceColor playerPieceColor;
        PieceColor enemyPieceColor;
        PlayerType enemyPlayerType;

        //Find player piece color
        if(playerType == PlayerType.BlackPlayer){
            playerPieceColor = PieceColor.BlackPiece;
            enemyPieceColor = PieceColor.WhitePiece;
            enemyPlayerType = PlayerType.WhitePlayer;
        }
        else{
            playerPieceColor = PieceColor.WhitePiece;
            enemyPieceColor = PieceColor.BlackPiece;
            enemyPlayerType =  PlayerType.BlackPlayer;
        }

        //Find king location
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(board[i][j].getColor() == playerPieceColor && board[i][j].getType() == PieceType.King){
                    kingX = j;
                    kingY = i;
                    break;
                }
            }
        }

        //Control each enemy piece can move to king
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(board[i][j].getColor() == enemyPieceColor){
                    if(controlMovementByPieceType(new Movement(j,i,kingX,kingY),enemyPlayerType))
                        return true;
                }
            }
        }

        return false;
    }


    private void doMovement(Movement movement){
        Piece sourcePiece = board[movement.getSourceY()][movement.getSourceX()];
        Piece targetPiece = board[movement.getTargetY()][movement.getTargetX()];

        targetPiece.setType(sourcePiece.getType());
        targetPiece.setColor(sourcePiece.getColor());
        targetPiece.setIcon(sourcePiece.getIcon());
        sourcePiece.setType(PieceType.Empty);
        sourcePiece.setColor(PieceColor.EmptyPiece);
        sourcePiece.setIcon(" ");
    }

    private void undoMovement(Movement movement ,Piece targetPiece){
        doMovement(new Movement(movement.getTargetX(),movement.getTargetY(),movement.getSourceX(), movement.getSourceY()));
        board[movement.getTargetY()][movement.getTargetX()].setType(targetPiece.getType());
        board[movement.getTargetY()][movement.getTargetX()].setColor(targetPiece.getColor());
        board[movement.getTargetY()][movement.getTargetX()].setIcon(targetPiece.getIcon());
    }
}
