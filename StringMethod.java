package StringMethod;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name="javaProgramming";
//		String s=new String("Kammo");
		String value=new String("PythonProgramming");
		System.out.println(value.charAt(0));
		System.out.println(value.concat("Programming"));
		System.out.println(value.length());
		System.out.println(value.substring(5));
		System.out.println(value.substring(4,7));
		System.out.println(value.replace('p','g'));
		System.out.println(value.toUpperCase());
		System.out.println(value.trim());
		System.out.println(value.toLowerCase());
		System.out.println(value.toLowerCase());
		System.out.println(value.indexOf('0'));
		System.out.println(value.isEmpty());
		System.out.println(value.equals("Python"));
//		System.out.println(value.equalIsIgnoreCase("Python"));
	}

}
