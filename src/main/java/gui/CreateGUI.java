package gui;

import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;

public class CreateGUI extends Application {
	
	public static void main(String[] args) {
		
		System.out.println("Launching JavaFX application.");
		
		// Start the JavaFx application by calling launch().
		launch(args);
	}
	
	// Override the init () method.
	public void init() {
		System.out.println("Inside the init() method");
	}
	
	// Override the start() method.
	public void start(Stage myStage) {
		System.out.println("Inside the start() method");
		
		// Give the stage a title.
		myStage.setTitle("ChessGame master");
		
		
		// Set the scene on the stage.
		myStage.setScene(DrawBoard.defaultBoard(8,8, 400, 400));

		// Show the stage and its scene.
		myStage.show();
		
	}
	
	// Override the stop() method.
	public void stop() {
		System.out.println("Inside the stop() method");
	}
}
