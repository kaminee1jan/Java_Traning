package Expception;

public class userdefinedException extends Exception {
	int value;
	userdefinedException(int datat1)
	{
	value=datat1;
	}
	public void myexception()
	{
		System.out.println(value);
	}

}
