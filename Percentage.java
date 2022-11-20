package Percentage;
import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Subject of number...");
		int n= sc.nextInt();
		int subject[] =new int[n];
		int sum=0;
		for(int i=0; i<n; i++) {
			subject[i]=sc.nextInt();
			sum=sum+subject[i];
		}
		System.out.println("Percentage of mark"+(sum/n)+"%");
	}

}
