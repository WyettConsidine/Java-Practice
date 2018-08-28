//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class SpiralMatrixRunner
{
	public static void main( String args[] )
	{
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
			SpiralMatrix spiral = new SpiralMatrix(i);
			System.out.println(spiral);
		}
	}
}