package Reverse;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		int length=name.length();
		System.out.println(length);
		String newname=" ";
		for(int i=length-1; i>=0; i--)
		{
			char value=name.charAt(i);
			newname=newname+value;
		}
		System.out.println(newname);
		
	}

}
