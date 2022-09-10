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
                icon = "R";
                break;
            case Knight:
                icon = "K";
                break;
            case Bishop:
                icon = "B";
                break;
            case Queen:
                icon = "Q";
                break;
            case King:
                icon = "X";
                break;
            case Pawn:
                icon = "P";
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
