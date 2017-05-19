package net.zuberahmed.solver.utils;

import java.util.HashMap;
import java.util.Map;

import net.zuberahmed.solver.models.Board;

public class BoardUtils {

	private static final int CHANCE_OF_HAVING_4 = 100;

	public static void fillRandomCell(Board board){

		int chanceOfOccurenceOf4 = (int) (Math.random()*1000);

		if(chanceOfOccurenceOf4 < CHANCE_OF_HAVING_4){
			fillRandomCellWith4(board);
		}
		else{
			fillRandomCellWith2(board);
		}
	}

	public static void fillRandomCellWith4(Board board){

		Map<Integer,String> emptyCellsMap = getEmptyCellsMap(board);

		String randomEmptyCell = getRandomEmptyCell(emptyCellsMap);

		String[] coordinates = randomEmptyCell.split("=");

		int x = Integer.parseInt(coordinates[0]);
		int y = Integer.parseInt(coordinates[1]);
		System.out.println("Coordinates of new value is " + x + "=" + y);
		board.cells[x][y] = 4;

	}

	public static void fillRandomCellWith2(Board board){

		Map<Integer,String> emptyCellsMap = getEmptyCellsMap(board);

		String randomEmptyCell = getRandomEmptyCell(emptyCellsMap);

		String[] coordinates = randomEmptyCell.split("=");

		int x = Integer.parseInt(coordinates[0]);
		int y = Integer.parseInt(coordinates[1]);
		board.cells[x][y] = 2;

	}

	public static Map<Integer,String> getEmptyCellsMap(Board board){

		Map<Integer,String> emptyCellsMap = new HashMap<>();

		int size = board.getSize();
		int k = 1;

		for(int i = 0; i < size; i++){
			for(int j = 0; j < size; j++){

				if(board.cells[i][j]==0){

					emptyCellsMap.put(k, i + "=" + j);

					k++;
				}
			}
		}

		return emptyCellsMap;
	}


	public static String getRandomEmptyCell(Map<Integer,String> emptyCellsMap){

		int size = emptyCellsMap.size();
		if(size == 1){
			return emptyCellsMap.get(1);
		}

		int random = (int)(Math.random()*(size)) + 1;
		return emptyCellsMap.get(random);
	}
}
