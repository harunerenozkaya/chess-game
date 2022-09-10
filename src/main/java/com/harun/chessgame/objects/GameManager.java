package com.harun.chessgame.objects;

import com.harun.chessgame.enums.PlayerType;

import java.util.Scanner;

public class GameManager implements IGameManager{
    private IBoard board;

    public GameManager(Board board){
        this.board = board;
    }

    @Override
    public void run() {
        System.out.println("!--- Welcome to the Chess Game ---!");

        while (true){
            printBoard();
            board.movePiece(getInputs(PlayerType.WhitePlayer),PlayerType.WhitePlayer);
            if(board.controlWinGame(PlayerType.WhitePlayer))
                break;
            printBoard();
            board.movePiece(getInputs(PlayerType.BlackPlayer),PlayerType.BlackPlayer);
            if(board.controlWinGame(PlayerType.BlackPlayer))
                break;
        }

    }

    private Movement getInputs(PlayerType playerType) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int sourceX = 0, sourceY = 0 ,targetX = 0 ,targetY = 0;

        if(playerType == PlayerType.WhitePlayer){
            System.out.println("White | Please enter movement : ");
        }
        else{
            System.out.println("Black | Please enter movement : ");
        }

        while(true){
            try{
                input = scanner.nextLine();

                String source = input.split("-")[0].toLowerCase();
                String target = input.split("-")[1].toLowerCase();

                sourceX = source.charAt(0)-97;
                sourceY = source.charAt(1)-48;

                targetX = target.charAt(0)-97;
                targetY = target.charAt(1)-48;
            }catch (Exception e){
                System.out.println("Please enter valid movement input!");
            }
            break;
        }

        return new Movement(sourceX,sourceY,targetX,targetY);
    }

    private void printBoard() {

    }
}
