package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<String> queue = new PriorityQueue<>();

queue.add("India");
queue.add("Germany");
queue.add("America");

System.out.println("Original Queue: "+ queue);

queue.remove();
System.out.println("queue after removing head element: " + queue);

String head = queue.peek();
System.out.println("Head of the queue: " + head);

head = queue.poll();
System.out.println("removed head: " + head);

System.out.println("queue now looks like this: " + queue);
	}

}
