package Reverse;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		int n,large;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array......");
        n=sc.nextInt();
        int Arrays[] = new int[n];
        System.out.println("Enter the elements of array......");
        for(int i=0;i<n;i++)
        {
            Arrays[i]=sc.nextInt();
        }
        large=Arrays[0];
        for(int i=0;i<n;i++)
        {
            if(large<Arrays[i])
            {
                large=Arrays[i];
            }
        }
        System.out.println("Maximum value="+large);
        
        
        
        
        
		// TODO Auto-generated method stub
//		int arr[] = {10, 324, 45, 90, 9808};
//        int max = Arrays.stream(arr).max().getAsInt();
//        System.out.println("largest in given array is " +max);
 

	}

}
