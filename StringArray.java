package StringArray;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of string array");
		int length= sc.nextInt();
		String names[]= new String[length];
		System.out.println("Enter the value");
		for(int i=0; i<names.length;i++) {
			names[i]=sc.next();
		}
		System.out.println("These are value");
		for(int i=0; i<names.length;i++) {
			System.out.println(names[i]);
		}
	}

}
