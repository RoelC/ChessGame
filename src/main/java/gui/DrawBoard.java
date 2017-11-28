package gui;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class DrawBoard {

	static Scene defaultBoard(int nrXFields, int nrYFields, int width, int heigth) {
		
		GridPane gridpane = new GridPane();

		for (int xIter = 0; xIter < nrXFields; xIter++) {
			for (int yIter = 0; yIter < nrYFields; yIter++) {
				Rectangle rect = new Rectangle(width/nrXFields, heigth/nrYFields);
				if ((xIter + yIter) % 2 == 0) {
					rect.setFill(Color.BLACK);
				} else {
					rect.setFill(Color.WHITE);
				}
				gridpane.add(rect, xIter, nrYFields - yIter);
			}
		}

		// Create a scene
		Scene myScene = new Scene(gridpane, width, heigth);	
		return myScene;
	}
	
	

	

}
