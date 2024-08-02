package Programing;

public class JaggedArray {

	public static void main(String[] args) {
		int arr[][] = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[4];
		arr[2] = new int[2];
		int i,j;
		for (i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length+1;j++)
			{ 
				arr[i][j] = (int)(Math.random() * 10);
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
		

	}

}
