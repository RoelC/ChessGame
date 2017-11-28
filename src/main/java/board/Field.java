package board;

import java.util.ArrayList;
import java.util.List;

public class Field {

	protected char xCoordinate;
	protected int yCoordinate;
	
	private boolean isFree = true;
	
	private List<Field> neighbourHorVer = new ArrayList<>();
	private List<Field> neighbourDiag = new ArrayList<>();
	
	Field(char xCoordinate, int yCoordinate){
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
	public char getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(char xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public int getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	public void printCooridnate() {
		System.out.print((char) xCoordinate + "" + yCoordinate + " ");
	}
	public boolean isFree() {
		return isFree;
	}
	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}
	public List<Field> getNeighbourHorVer() {
		return neighbourHorVer;
	}
	public void addNeighbourHorVer(Field neighbourHorVer) {
		this.neighbourHorVer.add(neighbourHorVer);
	}
	public List<Field> getNeighbourDiag() {
		return neighbourDiag;
	}
	public void addNeighbourDiag(Field neighbourDiag) {
		this.neighbourDiag.add(neighbourDiag);
	}
	
	
}
