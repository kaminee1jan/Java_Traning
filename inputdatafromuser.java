package inputdatafromuser;

import java.util.Scanner;

public class inputdatafromuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String value;
int number;
char character;
double percentage;
short number2;
long number3;
Scanner sc=new Scanner(System.in);
System.out.println("Enter one string data type ,one number,one character,one double value,one short,one long");
value=sc.next();
number=sc.nextInt();
character=sc.next().charAt(0);
percentage=sc.nextDouble();
number2=sc.nextShort();
number3=sc.nextLong();
System.out.println(value);
System.out.println(number);
System.out.println(character);
System.out.println(percentage);
System.out.println(number2);
System.out.println(number3);
	}

}
