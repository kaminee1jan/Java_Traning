package ArrayListDemo;
import java.util.ArrayList;
import java.util.Iterator;
public class DemoJavaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		create one object of arryList class
		ArrayList list=new ArrayList();
		Thread t1=new Thread();
		list.add("Database");
		list.add(5);
		list.add('Y');
		list.add(78.9f);
		list.add(t1);
//		traversing the list through iterator
		Iterator itr =list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
