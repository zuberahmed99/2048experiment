package net.zuberahmed.solver.models;

import net.zuberahmed.solver.utils.BoardUtils;

public class Board {

	private static final int SIZE = 4;

	public int[][] cells = new int[SIZE][SIZE];
	
	public Board(){
		
		
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				cells[i][j] = 0;
			}
		}
		
		BoardUtils.fillRandomCell(this);
	}

	public static int getSize() {
		return SIZE;
	}
	
	
}
