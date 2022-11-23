package SI;
import java.util.Scanner;
public class SI {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] array=new int[3];
		System.out.println("principle,rate of interest,time");

		for(int i=0;i<3;i++) {
		array[i]=sc.nextInt();

		}
		System.out.println("SI is= "+array[0]*array[1]*array[2]/100);
		

	}

}
