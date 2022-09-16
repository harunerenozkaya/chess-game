package com.harun.chessgame.objects;

import com.harun.chessgame.enums.PieceColor;
import com.harun.chessgame.enums.PieceType;

public class Piece {
    private PieceColor color;
    private PieceType type;
    private String icon;

    public Piece(PieceColor color, PieceType type) {
        this.color = color;
        this.type = type;

        switch (type){
            case Rook:
                if(color == PieceColor.WhitePiece)
                    icon = "\033[1;97m" + "\u2656";
                else
                    icon = "\033[1;30m" + "\u2656";
                break;
            case Knight:
                if(color == PieceColor.WhitePiece)
                    icon = "\033[1;97m" + "\u2658";
                else
                    icon = "\033[1;30m" + "\u2658";
                break;
            case Bishop:
                if(color == PieceColor.WhitePiece)
                    icon = "\033[1;97m" + "\u2657";
                else
                    icon = "\033[1;30m" + "\u2657";
                break;
            case Queen:
                if(color == PieceColor.WhitePiece)
                    icon = "\033[1;97m" + "\u2655";
                else
                    icon = "\033[1;30m" + "\u2655";
                break;
            case King:
                if(color == PieceColor.WhitePiece)
                    icon = "\033[1;97m" + "\u2654";
                else
                    icon = "\033[1;30m" + "\u2654";
                break;
            case Pawn:
                if(color == PieceColor.WhitePiece)
                    icon = "\033[1;97m" +"\u2659";
                else
                    icon = "\033[1;30m" + "\u2659";
                break;
            case Empty:
                icon = " ";
                break;
        }
    }

    public PieceColor getColor() {
        return color;
    }
    public PieceType getType() {
        return type;
    }
    public String getIcon() {
        return icon;
    }

    public void setColor(PieceColor color){
        this.color = color;
    }

    public void setType(PieceType type){
        this.type = type;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
}
