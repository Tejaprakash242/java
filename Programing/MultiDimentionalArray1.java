package Programing;

public class MultiDimentionalArray1 {

	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		int i,j;
		arr [0][0] = 1;
		arr [0][1] = 2;
		arr [1][0] = 3;
		arr [1][1] = 4;
		arr [2][0] = 5;
		arr [2][1] = 6;
		int sum = 0;
		for ( i=0; i<3; i++)
		{
			for( j=0; j<2; j++)
			{
				sum = arr[i][j];
				System.out.print(sum + " ");
				
				
				
			}
		
		System.out.println();
		//sum =sum + arr[i][j]; 
		}
	

	}

}
