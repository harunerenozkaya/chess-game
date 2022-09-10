package com.harun.chessgame.objects;

public class Movement {
    private int sourceX;
    private int sourceY;
    private int targetX;
    private int targetY;

    public Movement(int sourceX, int sourceY, int targetX, int targetY){
        this.sourceX = sourceX;
        this.sourceY = sourceY;
        this.targetX = targetX;
        this.targetY = targetY;
    }

    public int getSourceX() {
        return sourceX;
    }

    public int getSourceY() {
        return sourceY;
    }

    public int getTargetX() {
        return targetX;
    }

    public int getTargetY() {
        return targetY;
    }

    @Override
    public String toString() {
        return  "Source X : " + sourceX + "\n" +
                "Source Y : " + sourceY + "\n" +
                "Target X : " + targetX + "\n" +
                "Target Y : " + targetY + "\n";
    }
}
