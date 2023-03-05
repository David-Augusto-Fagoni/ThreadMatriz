package Controller;

public class ThreadMatriz extends Thread
{
	private int M[][] ;
	private int J;
	
	public ThreadMatriz(int[][] M, int J)
	{
		this.M = M;
		this.J = J;
	}
	public void run()
	{
		SMatriz();
	}
	public void SMatriz()
	{
		int T=0;
		StringBuffer buffer = new StringBuffer();
		String Msg;
		
		for (int K=0;K<5;K++)
		{
			T = T + M[J][K];
			buffer.append(M[J][K]+" ");
		}
		System.out.println(buffer+"= "+T);
	}
}
