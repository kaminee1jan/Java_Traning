package Expception;

public class UserdefindException extends Exception {
	int data;
	UserdefindException(int datat1)
	{
	data=datat1;
	}
	public void myexception()
	{
		System.out.println(data);
	}

}
