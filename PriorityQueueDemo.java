package ArrayListDemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pqueue=new PriorityQueue<String>();
		pqueue.add("pigeon");
		pqueue.add("peacock");
		pqueue.add("hornbill");
		pqueue.add("a");
		System.out.println("The first /head element is:"+pqueue.element());
		System.out.println("The first /head element is:"+pqueue.peek());

	}

}
