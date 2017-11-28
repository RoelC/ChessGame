package board;

import java.util.ArrayList;
import java.util.List;

public class Board {

	public enum Types {
		DEFAULT, HEXAGONIAL;
	}
	
	// TO DO:
	//	Encapsulation!
	public List<List<Field>> completeBoard = new ArrayList<List<Field>>();
	public Board(int nrXFields, int nrYFields){
		
		
		
		// Create field with boundaries
		for (int yIter = 0; yIter <= nrYFields + 1; yIter++) {
			List<Field> row = new ArrayList<Field>();
			for (int xIter = 0; xIter <= nrXFields + 1; xIter++) {
				if ((yIter == 0) || (yIter == nrYFields + 1) || (xIter == 0) || (xIter == nrXFields + 1)) {
					Boundary boundary = new Boundary((char)('@' + xIter), yIter);
					row.add(boundary);
				} else {
					Field field = new Field((char)('@' + xIter), yIter);
					row.add(field);
				}
			}
			completeBoard.add(row);
		}

		int[][] neighbourHorVer = {{0,1},{1,0},{0,-1},{-1,0}};
		int[][] neighbourDiag = {{1,1},{-1,1},{-1,-1},{1,-1}};

		// Set neighbours
		for (int yIter = 1 ; yIter <= nrYFields ; yIter++) {
			for (int xIter = 1 ; xIter <= nrXFields ; xIter++) {
				for(int[] coordinate:neighbourHorVer) {
						completeBoard.get(yIter).get(xIter).addNeighbourHorVer(
								completeBoard
								.get(yIter + coordinate[0])
								.get(xIter + coordinate[1]));
				}
				for(int[] coordinate:neighbourDiag) {
					completeBoard.get(yIter).get(xIter).addNeighbourDiag(
							completeBoard
							.get(yIter + coordinate[0])
							.get(xIter + coordinate[1]));
				}
			}
		}

		

		
		
	}

}
