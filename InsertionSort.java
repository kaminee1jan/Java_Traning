package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter values: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while (j>-1 && key<arr[j]) {
				arr[j+1]=arr[j];
				j--;
				}
			arr[j+1]=key;

	}
		 System.out.println("After Insertion Sort");    
	        for(int e=0;e<n;e++){    
	            System.out.print(Arrays.toString(arr));
	            break;
	        }  


	}

}
