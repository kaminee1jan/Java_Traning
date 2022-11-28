package TwoDimensionalary;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;
		int colum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows and colums of the 2 dimensionary");
		row=sc.nextInt();
		colum=sc.nextInt();
		int[][] numbers=new int[row][colum];
		System.out.println("Enter the value of array");
		for(int i=0; i<row; i++) 
		{
			for (int j=0; j<colum; j++)
			{
				numbers[i][j]=sc.nextInt();
			}
		}
		System.out.println("My array is:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<colum;j++)
			{
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}


	}

}













