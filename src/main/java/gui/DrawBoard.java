package gui;

import java.util.List;

import board.Board;
import board.Field;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class DrawBoard {

	static Scene defaultBoard(int nrXFields, int nrYFields, int width, int heigth) {
		

		Pane pane = new Pane();
		//pane.setStyle("-fx-background-color: white;");
		pane.setPrefSize(width, heigth);
		/*		GridPane gridpane = new GridPane();

		String Coordinate = "";
		for (int xIter = 0; xIter < nrXFields; xIter++) {
			for (int yIter = 0; yIter < nrYFields; yIter++) {
				final Rectangle rect = new Rectangle(width/nrXFields, heigth/nrYFields);
				if ((xIter + yIter) % 2 == 0) {
					rect.setFill(Color.BLACK);
				} else {
					rect.setFill(Color.WHITE);
				}


				gridpane.add(rect, xIter, nrYFields - yIter);
			}
		}
*/
		Board board = new Board(8,8);
		
		for(List<Field> row : board.getCompleteBoard())
			for(Field field: row)
				{
					//drawField(field,pane);
					pane.getChildren().addAll(field.getShape());
				}
		
		// Create a scene
		Scene myScene = new Scene(pane, width, heigth + 50);	
		return myScene;
	}
	
	//static void drawField(Field field, Pane pane) {
		//field.getShape().relocate(20, 20)
		
	//}
	

	
	

	

}
