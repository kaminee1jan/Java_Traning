package ArrayListDemo;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1=new Vector();
		Vector v2=new Vector();
		Vector<String> v3=new Vector<String>();
		Vector<Myclass> v4=new Vector<Myclass>();
		Myclass class1=new Myclass();
		Myclass class2=new Myclass();
		v4.add(class1);
		v4.add(class2);
		v3.add("collections");
		v3.add("spring framework");
		v1.add(1);
		v1.add("vector");
		v2.addAll(v1);
		v2.add(8.9f);
		v2.add(true);
		Iterator itr =v2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
