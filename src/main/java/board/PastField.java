package board;

import javafx.scene.paint.Color;

public class PastField {

	private Field field;
	private Color color;
	
	PastField(Field field, Color color){
		this.field = field;
		this.color = color;
	}
	
	public Field getField(){
		return this.field;
	}
	
	public Color getColor() {
		return this.color;
	}
}