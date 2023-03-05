package View;
import java.math.*;

import Controller.ThreadMatriz;

public class Main {
	public static void main(String args[])
	{
		int M[][] = new int [3][5];
		
		for (int J=0;J<3;J++)
		{
			for (int K=0;K<5;K++)
			{
				M[J][K] = (int) (Math.random()*11);
			}
		}
		
		for (int J=0;J<3;J++)
		{
			ThreadMatriz T = new ThreadMatriz(M, J);
			T.start();
		}
	}
}
