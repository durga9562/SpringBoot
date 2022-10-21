package collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();

		list.add("A");
		list.add("B");
		list.addLast("E");
		list.addFirst("D ");
		list.add(2, "E");
	

		System.out.println(list);
		
		list.remove("B");
		list.remove(3);
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);
	}

}
