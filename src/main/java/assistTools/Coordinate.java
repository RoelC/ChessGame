package assistTools;

public class Coordinate {

	private char x;
	private int y;
	
	Coordinate(char x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getCoordinates() {
		return "("+ x + ", " + y + ")"; 
	}
	
	
	
	
}
