package Programing;

public class MultiDimentionalArray {

	public static void main(String[] args) 
	{
		double num[][] = new double [4][4];
		//int random = 0;
				
	for (int i = 0; i<4;i++)
	{
		for (int j=0;j<4;j++)
		{
			num[i][j] = (double)(Math.random());
			System.out.println(num[i][j]);
		}
		
				}
		for (int i = 0; i<4;i++)
		{
			for (int j=0;j<4;j++)
			{
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	

	}

}
