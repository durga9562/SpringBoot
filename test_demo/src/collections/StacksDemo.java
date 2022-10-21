package collections;

import java.util.Stack;

public class StacksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();

		stack.push("America");
		stack.push("Germany");
		stack.push("India");

		System.out.println("stack: " + stack);

		String poppedElement = stack.pop();
		System.out.println("popped element : " + poppedElement);

		System.out.println("Now the stack looks like: " + stack);
		
		String poppedElement1 = stack.pop();
		System.out.println("popped element1 : " + poppedElement1);
	}

}
