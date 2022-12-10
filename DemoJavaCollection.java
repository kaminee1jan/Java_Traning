package ArrayListDemo;
import java.util.ArrayList;
import java.util.Iterator;
public class DemoJavaCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		create one object of arryList class
		ArrayList<Integer> list=new ArrayList<Integer>();
//		Integer and int
//		Thread t1=new Thread();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(78);
		list.add(2,null);
		System.out.println(list.isEmpty());
		System.out.println(list.contains(9));
		System.out.println(list.remove(3));
		System.out.println(list.remove(null));
//		traversing the list through iterator
		Iterator itr =list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
