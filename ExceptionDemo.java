package Expception;

public class ExceptionDemo {

	public static void main(String[] args) throws  UserdefindException {
		// TODO Auto-generated method stub
		try
		{
		throw new UserdefindException(10);
		}
		catch(UserdefindException e) {
			e.printStackTrace();
//			System.out.println(e);
		}

	}

}
