package CollectionsFramwork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class HashDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set=new HashSet<String>();
		LinkedHashSet<String> set1=new LinkedHashSet<String>();
		set.add("z");
		set.add("y");
		set.add("x");
		set.add("a");
		set.add(null);
		set.add("a");
		
		Iterator<String> itr1=set.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
//		set.add("Honda");
//		set.add("Hyundai");
//		set.add("ecosport");
//		set.add(" ");
//		set.add(null);
		//Traversing elements
//		Iterator<String> itr=set.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}

	}

}
