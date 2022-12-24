package Expception;

public class Expception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numarray=new int[5];
		try
		{
			numarray=new int[5];
			numarray[7]=500;
			System.out.println(numarray[7]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("I am in finally block");
		}

	}

}

