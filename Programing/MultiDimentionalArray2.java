package Programing;

public class MultiDimentionalArray2 {

	public static void main(String[] args) {
		int[][] arr = {{1,2},{3,4},{5,6}};
		int i,j;
		int size =0;
		for (i = 0; i<3;i++)
		{ 
			size += arr[i].length;
			
		}
		System.out.println(size);
		

	}

}
