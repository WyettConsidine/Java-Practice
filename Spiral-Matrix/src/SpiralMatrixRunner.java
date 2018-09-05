//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Elia Gorokhovsky

public class SpiralMatrixRunner {

	public static void main( String args[] ) {
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
			SpiralMatrix spiral = new SpiralMatrix(i);
		}
		SpiralMatrix spiralMatrix = new SpiralMatrix(200);
		System.out.println(spiralMatrix.elements[6][14]);
	}
}