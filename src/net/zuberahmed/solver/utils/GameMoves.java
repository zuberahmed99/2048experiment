package net.zuberahmed.solver.utils;

import net.zuberahmed.solver.models.Board;

public class GameMoves {

	public static void printBoard(Board board){

		int size = board.getSize();

		for(int i = 0; i < size; i++){
			for(int j = 0; j< size; j++){
				System.out.print(board.cells[i][j]+ " ");
			}
			System.out.println();
		}

	}

	public static void swap(int a, int b){
		int temp;
		temp = a;
		a = b;
		b = temp;
	}

	public static void swipeRight(Board board){
		int size = board.getSize();

		//Remove blank cells
		for(int k=0; k<3; k++){
			for(int i = 0; i< size; i++){
				for(int j = size-1; j > 0; j--){
					if(board.cells[i][j]==0){
						int temp = board.cells[i][j];
						board.cells[i][j] = board.cells[i][j-1];
						board.cells[i][j-1] = temp;
					}
				}
			}
		}


		//add values if possible
		for(int i =0; i < size; i++){
			for(int j = size-2; j >= 0; j--){

				try{
					if(board.cells[i][j]==board.cells[i][j+1]){
						//if two adjacent cells are equal sum them and make the previous one zero
						board.cells[i][j+1] = board.cells[i][j+1] + board.cells[i][j]; 
						board.cells[i][j] = 0;
					}
				}catch(Exception e){
					e.printStackTrace();
					System.out.println("i : " + i + "     j : " + j);
				}
			}

		}
		for(int i =0; i < size; i++){
			for(int j = size-2; j >= 1; j--){

				try{
					if(board.cells[i][j]==0){

						int temp = board.cells[i][j];
						board.cells[i][j] = board.cells[i][j-1];
						board.cells[i][j-1] = temp;

					}
				}catch(Exception e){
					e.printStackTrace();
					System.out.println("i : " + i + "     j : " + j);
				}
			}
		}

	}

	public static void swipeLeft(Board board){

		int size = board.getSize();

		for(int k=0; k<3; k++){
			for(int i =0; i < size; i++){
				for(int j = 0; j < size-1; j++){

					if(board.cells[i][j]==0){

						int temp = board.cells[i][j];
						board.cells[i][j] = board.cells[i][j+1];
						board.cells[i][j+1] = temp;

					}
				}
			}
		}

		for(int i =0; i < size; i++){
			for(int j = 1; j <size; j++){

				try{
					if(board.cells[i][j]==board.cells[i][j-1]){
						//if two adjacent cells are equal sum them and make the previous one zero
						board.cells[i][j-1] = board.cells[i][j-1] + board.cells[i][j]; 
						board.cells[i][j] = 0;
					}
				}catch(Exception e){
					e.printStackTrace();
					System.out.println("i : " + i + "     j : " + j);
				}
			}

		}
		for(int i =0; i < size; i++){
			for(int j = 1; j < size-1; j++){

				try{
					if(board.cells[i][j]==0){

						int temp = board.cells[i][j];
						board.cells[i][j] = board.cells[i][j+1];
						board.cells[i][j+1] = temp;

					}
				}catch(Exception e){
					e.printStackTrace();
					System.out.println("i : " + i + "     j : " + j);
				}
			}
		}

	}
	public static void swipeDown(Board board){
		int size = board.getSize();
		
		
		for(int k=0; k<3; k++){
			for(int j = 0; j< size; j++){
				for(int i = size-1; i > 0; i--){
					if(board.cells[i][j]==0){
						int temp = board.cells[i][j];
						board.cells[i][j] = board.cells[i-1][j];
						board.cells[i-1][j] = temp;
					}
				}
			}
		}
		
		
		for(int j =0; j < size; j++){
			for(int i = size-2; i >= 0; i--){

				try{
					if(board.cells[i][j]==board.cells[i+1][j]){
						//if two adjacent cells are equal sum them and make the previous one zero
						board.cells[i+1][j] = board.cells[i+1][j] + board.cells[i][j]; 
						board.cells[i][j] = 0;
					}
				}catch(Exception e){
					e.printStackTrace();
					System.out.println("i : " + i + "     j : " + j);
				}
			}
		}
		
		for(int j =0;j < size; j++){
			for(int i = size-2; i >= 1; i--){

				try{
					if(board.cells[i][j]==0){

						int temp = board.cells[i][j];
						board.cells[i][j] = board.cells[i-1][j];
						board.cells[i-1][j] = temp;

					}
				}catch(Exception e){
					e.printStackTrace();
					System.out.println("i : " + i + "     j : " + j);
				}
			}
		}
		
		
	}
	
	public static void swipeUp(Board board){
		int size = board.getSize();
		
		
		for(int k=0; k<3; k++){
			for(int j =0; j < size; j++){
				for(int i = 0; i < size-1; i++){

					if(board.cells[i][j]==0){

						int temp = board.cells[i][j];
						board.cells[i][j] = board.cells[i+1][j];
						board.cells[i+1][j] = temp;

					}
				}
			}
		}
		
		
		
		for(int j =0; j < size; j++){
			for(int i = 1; i <size; i++){

				try{
					if(board.cells[i][j]==board.cells[i-1][j]){
						//if two adjacent cells are equal sum them and make the previous one zero
						board.cells[i-1][j] = board.cells[i-1][j] + board.cells[i][j]; 
						board.cells[i][j] = 0;
					}
				}catch(Exception e){
					e.printStackTrace();
					System.out.println("i : " + i + "     j : " + j);
				}
			}
		}
		
		
		for(int j =0; j < size; j++){
			for(int i = 1; i < size-1; i++){

				try{
					if(board.cells[i][j]==0){

						int temp = board.cells[i][j];
						board.cells[i][j] = board.cells[i+1][j];
						board.cells[i+1][j] = temp;

					}
				}catch(Exception e){
					e.printStackTrace();
					System.out.println("i : " + i + "     j : " + j);
				}
			}
		}
	}

}
