package board;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

import java.util.ArrayList;
import java.util.List;

public class Board {

	static List<PastField> coloredFields = new ArrayList<PastField>();
	
	
	public enum Types {
		DEFAULT, HEXAGONIAL;
	}
	
	// TO DO:
	//	Encapsulation!
	private List<List<Field>> completeBoard = new ArrayList<List<Field>>();
	public Board(int nrXFields, int nrYFields){
		
		
		
		// Create field with boundaries
		for (int yIter = 0; yIter < nrYFields; yIter++) {
			List<Field> row = new ArrayList<Field>();
			for (int xIter = 0; xIter < nrXFields; xIter++) {
				Color color = Color.WHITE;
				if ((yIter + xIter)%2 == 1) 
					color = Color.BLACK;
				Field field = new Field("" + (char)('@' + xIter) + yIter, xIter*50, yIter*50, color);
				setListeners(field);
				row.add(field);
			}
			completeBoard.add(row);
		}

		int[][] neighbourHorVer = {{0,1},{1,0},{0,-1},{-1,0}};
		int[][] neighbourDiag = {{1,1},{-1,1},{-1,-1},{1,-1}};

		// Set neighbours
		for (int yIter = 0 ; yIter < nrYFields ; yIter++) {
			for (int xIter = 0 ; xIter < nrXFields ; xIter++) {
				for(int[] coordinate:neighbourHorVer) {
					if( yIter + coordinate[0] == -1 || yIter + coordinate[0] == nrYFields ||
						xIter + coordinate[1] == -1 || xIter + coordinate[1] == nrXFields)
						completeBoard.get(yIter).get(xIter).addNeighbourHorVer(null);
					else
						completeBoard.get(yIter).get(xIter).addNeighbourHorVer(
								completeBoard
								.get(yIter + coordinate[0])
								.get(xIter + coordinate[1]));
				}
				for(int[] coordinate:neighbourDiag) {
					if( yIter + coordinate[0] == -1 || yIter + coordinate[0] == nrYFields ||
						xIter + coordinate[1] == -1 || xIter + coordinate[1] == nrXFields)
						completeBoard.get(yIter).get(xIter).addNeighbourDiag(null);
					else
						completeBoard.get(yIter).get(xIter).addNeighbourDiag(
								completeBoard
								.get(yIter + coordinate[0])
								.get(xIter + coordinate[1]));
				}
			}
		}
	}
	
	private void setListeners(final Field field){
		field.shape.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent t) {

				for (PastField pastField : coloredFields) {
					pastField.getField().shape.setFill(pastField.getColor());
				}
				coloredFields.clear();
				coloredFields.add(new PastField(field, field.getColor()));
				field.shape.setFill(Color.RED);
				for (Field field : field.getNeighbourHorVer())
					if (field != null) {
						coloredFields.add(new PastField(field, field.getColor()));
						field.shape.setFill(Color.BLUE);
					}
				for (Field field : field.getNeighbourDiag())
					if (field != null) {
						coloredFields.add(new PastField(field, field.getColor()));
						field.shape.setFill(Color.GREEN);
					}
			}
		});
	}
	
	public List<List<Field>> getCompleteBoard() {
		return completeBoard;
	}	
}
