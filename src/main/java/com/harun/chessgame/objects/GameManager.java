package com.harun.chessgame.objects;

import com.harun.chessgame.enums.PlayerType;

import java.util.Scanner;

public class GameManager implements IGameManager{
    private IBoard board;

    public GameManager(Board board){
        this.board = board;
    }

    @Override
    public void run(){
        boolean isMoveable;
        Movement currentMovement;
        String winnerPlayer = null;

        System.out.println("!--- Welcome to the Chess Game ---!");
        System.out.println("Tip : Movement inputs must be like : (source)-(target)");
        System.out.println("Exp : b4-b6 , c3-d4 etc.\n\n");

        while (winnerPlayer == null){
            //White Player Movement
            do{
                //Print chess board
                board.printBoard();

                //Get movement
                currentMovement = getInputs(PlayerType.WhitePlayer);
                //Control if movement is movable
                isMoveable = board.isMoveable(currentMovement,PlayerType.WhitePlayer);

                if(isMoveable){
                    //Do movement
                    board.doMovement(currentMovement);
                    //Control if player win the game
                    if(board.controlWinGame(PlayerType.WhitePlayer)){
                        winnerPlayer = "White Player";
                        break;
                    }
                }
            }while(!isMoveable);

            if(winnerPlayer == null){
                //Black Player Movement
                do{
                    //Print chess board
                    board.printBoard();

                    //Get movement
                    currentMovement = getInputs(PlayerType.BlackPlayer);
                    //Control if movement is movable
                    isMoveable = board.isMoveable(currentMovement,PlayerType.BlackPlayer);

                    if(isMoveable){
                        //Do movement
                        board.doMovement(currentMovement);
                        //Control if player win the game
                        if(board.controlWinGame(PlayerType.BlackPlayer)){
                            winnerPlayer = "Black Player";
                            break;
                        }
                    }
                } while(!isMoveable);
            }
        }

        System.out.println(winnerPlayer + " Won !");
        board.printBoard();
    }

    private Movement getInputs(PlayerType playerType) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int sourceX = 0, sourceY = 0 ,targetX = 0 ,targetY = 0;
        boolean isNotValid = false;

        while(!isNotValid){
            try{
                if(playerType == PlayerType.WhitePlayer){
                    System.out.print("White | Please enter movement : ");
                }
                else{
                    System.out.print("Black | Please enter movement : ");
                }

                input = scanner.nextLine();

                String source = input.split("-")[0].toLowerCase();
                String target = input.split("-")[1].toLowerCase();

                sourceX = source.charAt(0)-97;
                sourceY = source.charAt(1)-49;

                targetX = target.charAt(0)-97;
                targetY = target.charAt(1)-49;

                if(sourceX < 0 || sourceX > 7 || sourceY < 0 || sourceY > 7 || targetX < 0 || targetX > 7 || targetY < 0 || targetY > 7 || source.equals(target)){
                    System.out.println("Please enter valid movement input!");
                    isNotValid = false;
                }
                else
                    isNotValid = true;

            }catch (Exception e){
                System.out.println("Please enter valid movement input!");
                isNotValid = false;
            }
        }

        return new Movement(sourceX,sourceY,targetX,targetY);
    }

}
