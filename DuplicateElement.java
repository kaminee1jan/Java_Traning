package Assignment;
import java.util.Scanner;
public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = scn.nextInt();
        int[] arr = new int[n];
        int count=0;
        System.out.println("Enter array elements");
        for(int k=0;k<n;k++)
        {
            arr[k]= scn.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if (arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }

	}

}
