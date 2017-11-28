import static org.junit.Assert.*;
import org.junit.Test;
import board.Board;


public class CheckField {

	@Test
	public void test() {
		
		Board fullBoard = new Board(8,8);
			
		for (int i = 1; i < 9 ; i++) {
			for (int j = 1; j < 9 ; j++) {
				fullBoard.completeBoard.get(i).get(j).printCooridnate();
			}
			System.out.println();
		}
			
		
		assertTrue(true);
	}

}
