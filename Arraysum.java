package Arraysum;
import java.util.Scanner;
public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Array of elements you want to enter.......");
		int n=sc.nextInt();
		int[] myarray=new int[n];
		System.out.println("Enter array elements.....");
		for(int i=0;i<n;i++) {
			myarray[i]=sc.nextInt();
		}
		System.out.println("Array of values....");
		int sum=0;
		for(int i=0; i<n; i++) {
			sum=sum+myarray[i];
		}
		System.out.println("Sum of Array is...."+sum);

	}

}
