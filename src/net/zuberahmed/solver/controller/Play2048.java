package net.zuberahmed.solver.controller;

import java.util.Scanner;

import net.zuberahmed.solver.models.Board;
import net.zuberahmed.solver.utils.BoardUtils;
import net.zuberahmed.solver.utils.GameMoves;

public class Play2048 {

	
	
	public static void main(String[] args){
		
		Board board = new Board();
		GameMoves.printBoard(board);
		Scanner scan = new Scanner(System.in);
		String move = scan.next();
		
		while(move.equalsIgnoreCase("A") || move.equalsIgnoreCase("S") || move.equalsIgnoreCase("W")||move.equalsIgnoreCase("D") ){
			
			if(move.equalsIgnoreCase("A")){
			GameMoves.swipeLeft(board);
			}
			if(move.equalsIgnoreCase("D")){
				GameMoves.swipeRight(board);
			}
			if(move.equalsIgnoreCase("S")){
				GameMoves.swipeDown(board);
			}
			if(move.equalsIgnoreCase("W")){
				GameMoves.swipeUp(board);
			}
			
			BoardUtils.fillRandomCell(board);
			GameMoves.printBoard(board);
			move = scan.next();
		}
		
		
	}
}
