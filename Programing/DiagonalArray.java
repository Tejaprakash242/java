package Programing;

public class DiagonalArray {

	public static void main(String[] args) 
	{
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = {{9,8,7},{6,9,4},{3,2,1}};
		int i,j;
		int sum=0;
		int sum1 =0;
		for (i=0;i<3;i++)
		
		{
			for(j=0;j<3;j++)
			{
				if(i == j)
				{
					sum = sum + a[i][j];
					sum1 = sum1 + b[i][j];
				}
			}
			
		}
		System.out.println(sum);
		System.out.println(sum1);
		

	}

}
