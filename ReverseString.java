package Assignment;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=s.nextInt();
		int[] array=new int[n];
		System.out.println("Element of the array......");
		for(i=0;i<n;i++) {
			array[i]=s.nextInt();
		}
		System.out.println("Reverse of the array.......");
		for(i=n-1; i>=0;i--) {
			System.out.print(array[i]+" ");

	}

}
