package ArrayListDemo;

import java.util.Iterator;
import java.util.LinkedList;
public class TestLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Myclass> llist=new LinkedList<Myclass>();
		LinkedList<String> llist2=new LinkedList<String>();
		llist2.add("apple");
		llist2.add("meta");
		llist2.add("amazon");
		llist2.addFirst("facebook");
		llist2.addLast("visa");
		llist2.add("google");
		System.out.println(llist2.getFirst());
		Myclass m1=new Myclass();
		Myclass m2=new Myclass(67);
		llist.add(m1);
		llist.add(m2);
		
//		llist.add("linked list");
//		llist.add(1);
//		llist.add('3');
//		llist.add("linked list");
//		llist.add(9.65f);

		
		
		Iterator itr= llist2.iterator();
		while(itr.hasNext())
		{
//			System.out.println(itr.next());
			System.out.println(itr.next().toString());
		}
//		Iterator itr= llist.iterator();
//		while(itr.hasNext())
//		{
////			System.out.println(itr.next());
//			System.out.println(itr.next().toString());
//		}

	}

}
