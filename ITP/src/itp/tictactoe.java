/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itp;

/**
 *
 * @author Aiman Hakimi
 */

import java.util.Scanner;

public class tictactoe {
    
    public static void main(String[] args){
        
        boolean gameEnd = false;
        int round = 0;
        int occupiedBoard = 0;
        String[] board = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        Scanner input = new Scanner(System.in);
        
        
        while(!gameEnd){
            
            // Board Game and round initialization
            ++round;
            System.out.println("\n" + board[0] + "|" + board[1] + "|" + board[2]);
            System.out.println("-+-+-");
            System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
            System.out.println("-+-+-");
            System.out.println(board[6] + "|" + board[7] + "|" + board[8] + "\n");
            
            
            //Reads and checks valid moves
            if(round % 2 != 0){
                while(true){
                    System.out.print("Player 1 move: ");
                    int moveOne = input.nextInt();
                    
                    if("X".equals(board[moveOne-1]) || "O".equals(board[moveOne-1])){
                        System.out.println("Invalid move ");
                    }else{
                        board[moveOne - 1] = "X";
                        break;
                    }
                }
            }else{
                while(true){
                    System.out.print("Player 2 move: ");
                    int moveOne = input.nextInt();
                    
                    if("X".equals(board[moveOne-1]) || "O".equals(board[moveOne-1])){
                        System.out.println("Invalid move ");
                    }else{
                        board[moveOne - 1] = "O";
                        break;
                    }
                }
            }
            
            //Check wins and draws
            
            for(int i = 0; i < 8; i++){
                String line = null;
                switch(i){
                    case 0 -> line = board[0] + board[1] + board[2];
                    case 1 -> line = board[3] + board[4] + board[5];
                    case 2 -> line = board[6] + board[7] + board[8];
                    case 3 -> line = board[0] + board[3] + board[6];
                    case 4 -> line = board[1] + board[4] + board[7];
                    case 5 -> line = board[2] + board[5] + board[8];
                    case 6 -> line = board[0] + board[4] + board[8];
                    case 7 -> line = board[2] + board[4] + board[6];                    
                }
                
                if("XXX".equals(line)){
                    System.out.println("Player 1 wins");
                    gameEnd = true;
                }else if("OOO".equals(line)){
                    System.out.println("Player 2 wins");
                    gameEnd = true;
                }
                
                for(int a = 0; a < 8 ; a++){
                    if(board[a] != "X" || board[a] != "O"){
                        break;
                    }else{
                        System.out.println("DRAW");
                        gameEnd = true;
                    }
                }
            }
        }
        
    }
    
}
