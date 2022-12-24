package Assignment;
import java.util.Scanner;
public class Median {

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
		int j=0;
		int c=0;
		while(j<n) {
			int x=0;
			while(x<n) {
				if(arr[j]<arr[x]) {
					c=arr[x];
					arr[x]=arr[j];
					arr[j]=c;
				}
				x++;
				
				}
			j++;
			}
		int odd_median = 0;
		float even_median=0;
		for(int i=0;i<n;i++) {
			if(n%2!=0) {
				odd_median=arr[n/2];
			}
			else {
				even_median=(arr[n/2]+arr[n/2-1])/2;
				
			}
			
		}
		System.out.println("Median of even array: "+even_median);
		System.out.println("Median of odd array :"+odd_median);
		

	}

}
