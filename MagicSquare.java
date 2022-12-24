package Assignment;
import java.util.Scanner;
public class MagicSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner s = new Scanner(System.in);
            System.out.println("Enter the number");  
            int n = s.nextInt();
	        int[][]arr= new int[n+1][n+1];
	        int r=1;
	        int c=(n+1)/2;
	        for(int i=1;i<=n*n;i++) {
	            arr[r][c] = i;
	            r--;
	            c++;
	            if (r < 1 && c > n) {
	                r = r + 2;
	                c--;
	            }
	            else if (r < 1) {
	                r = n;
	            }
	            else if (c > n) {
	                c = 1;
	            }
	            else if (arr[r][c] != 0) {
	                r = r + 2;
	                c--;
	            }

	        }
	            for ( r=1;r<=n;r++)
	            {

	                for(c=1;c<=n;c++)
	                {
	                    System.out.print(arr[r][c]+" ");
	                }
	                System.out.println();
	            }
	        }
	

}
