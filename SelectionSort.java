package Assignment;

import java.util.Scanner;

public class SelectionSort {

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
		
		 for(int i=0; i<n; i++)  
	       {  
	           for(int j=i+1; j<n; j++)  
	           {  
	               if(arr[i] > arr[j])  
	               {  
	                   int temp = arr[i];  
	                   arr[i] = arr[j];  
	                   arr[j] = temp;  
	               }  
	           } 

	}
		 System.out.println("After selection sort: ");
		 for(int i=0;i<n;i++) {
			 System.out.print(arr[i]+" ");
		 }


	}

}
