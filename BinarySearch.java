package Assignment;
import java.util.Scanner;
public class BinarySearch {

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
		System.out.println("Enter value to be searched:");
		int num=sc.nextInt();
		
		int low=0;
		int high=n-1;
		int mid=0;
		
		while(low<=high) {
			mid=(low+high)/2;
			if (arr[mid]==num) {
				System.out.println(mid+"is the index value");
				break;
				}
			else if(arr[mid]>num) {
				high=mid-1;
			}
			else if(arr[mid]<num) {
				low=mid+1;
			}
		}
		if (low>high) {
			System.out.println("not found");
		}


	}

}
