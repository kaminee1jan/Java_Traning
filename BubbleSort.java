package Assignment;
import java.util.Scanner;
import java.util.Arrays;
public class BubbleSort {

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
		 System.out.println("After Bubble Sort");    
	     for(int e=0;e<n;e++){    
	         System.out.print(Arrays.toString(arr));
	         break;
		}

	}

}
