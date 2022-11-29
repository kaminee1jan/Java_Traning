package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDiffrentDatatWithIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
//		Thread t1=new Thread();
		list.add("JavaProgramming");
		list.add(18);
		list.add('A');
		list.add(56.8f);
//		list.add(t1);
//		traversing the list through iterator
		Iterator itr =list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
