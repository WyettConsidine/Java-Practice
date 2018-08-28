//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

import static java.lang.System.*;

public class SpiralMatrix
{
	//define a matrix
	private int[][] elements;

	/**
	 * Fills a spiral matrix recursively
	 * @param i the start row
	 * @param j the end row
	 * @param n the side length
	 * @param startNum the first element - 1
	 */
	public void fillSpiral(int i, int j, int n, int startNum) {
		//Trivial cases
		if (n == 1) {
			this.elements[i][j] = startNum + 1;
		} else if (n == 2) {
			this.elements[i][j] = startNum + 1;
			this.elements[i + 1][j] = startNum + 2;
			this.elements[i + 1][j + 1] = startNum + 3;
			this.elements[i][j + 1] = startNum + 4;
		} else {
			//First row
			this.elements[i][j] = startNum + 1;
			for (int index = 1; index < n; index++) {
				this.elements[i][j + index] = 4 * n - 3 + startNum - index;
			}
			//Subsequent rows
			for (int index = 1; index < n - 1; index++) {
				this.elements[i + index][j] = startNum + index + 1;
				this.elements[i + index][j + n - 1] = startNum + 3 * n - 2 - index;
			}
			//Last row
			for (int index = 0; index < n; index++) {
				this.elements[i + n - 1][j + index] = n + startNum + index;
			}
			//Recurve
			fillSpiral(i + 1, j + 1, n - 2, 4 * (n - 1) + startNum);
		}
	}

	public SpiralMatrix(int size)
	{
		assert size >= 1;
		this.elements = new int[size][size];
		fillSpiral(0, 0, size, 0);
	}

	public String toString( )
	{
		String output="";
		for (int i = 0; i < this.elements.length; i++) {
			output += Arrays.toString(this.elements[i]) + "\n";
		}
		return output;
	}
}