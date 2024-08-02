package Programing;

public class AddArray {

	public static void main(String[] args) 
	{
		int a[][] = {{1,2,3},{4,5,6}};
		int b[][]= {{4,5,6},{6,7,8}};
		int i,j;
		int c[][]= new int[2][3];
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]= a[i][j]+b[i][j];
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
		
		

	}

}
