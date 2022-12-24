package Expception;

public class nestedexample2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try
		{
		throw new userdefinedException(20);
		}
		catch(userdefinedException e) {
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("I am in finally block");
		}

	}

}
