package Assignment;
import java.util.Scanner;
public class Mean {

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
		int sum = 0;
		for(int i = 0; i <n; i++) {
			sum+=arr[i];
			}
		System.out.println("Mean of array is "+ sum/(float)n);	 

	}

}
