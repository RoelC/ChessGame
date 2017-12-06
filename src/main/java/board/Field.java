package board;

//import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.shape.Shape;
import javafx.event.EventHandler;
import javafx.scene.shape.Rectangle;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Field {

	private String name;
	private int xCoordinate;
	private int yCoordinate;

	public Shape shape;

	private Color color;

	private boolean isFree = true;

	private List<Field> neighbourHorVer = new ArrayList<>();
	private List<Field> neighbourDiag = new ArrayList<>();


	public List<Field> getNeighbourHorVer() {
		return neighbourHorVer;
	}

	public List<Field> getNeighbourDiag() {
		return neighbourDiag;
	}

	private Field(String name, int xCoordinate, int yCoordinate) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.name = name;
	}
	
	public Field(String name, int xCoordinate, int yCoordinate, Color color) {
		this(name, xCoordinate, yCoordinate);
		this.shape = new Rectangle(50, 50);
		this.shape.setFill(color);
		this.color = color;
		//setListeners(this.shape);
	}

	public Field(String name, int xCoordinate, int yCoordinate, Color color, Shape shape) {
		this(name, xCoordinate, yCoordinate);
		this.shape = shape;
		this.shape.setFill(color);
		this.color = color;
		//setListeners(this.shape);
		System.out.println(name + color);
	}
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public int getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

	public Field getFieldAtHorVer(int iter) {
		return neighbourHorVer.get(iter);
	}

	public void addNeighbourHorVer(Field field) {
		this.neighbourHorVer.add(field);
	}

	public Field getFieldAtDiag(int iter) {
		return neighbourDiag.get(iter);
	}

	public void addNeighbourDiag(Field field) {
		this.neighbourDiag.add(field);
	}

	public Shape getShape() {
		shape.relocate(xCoordinate, yCoordinate);
		return shape;
	}




}
