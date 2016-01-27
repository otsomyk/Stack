package stack;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Stack {
	private LinkedList<Object> stackList;

	public Stack() {
		stackList = new LinkedList();
	}

	public void push(Object obj) {

		stackList.addLast(obj);
	}

	public Object pop() {
		Object object;

		if (stackList.isEmpty()) {
			throw new NoSuchElementException("List is empty");
		} else {
			object = stackList.getLast();
			stackList.removeLast();
		}
		return object;
	}

	public Object peak() {
		if (stackList.isEmpty()) {
			throw new NoSuchElementException("List is empty");
		}
		return stackList.getLast();
	}

	public void printList() {
		for (Object obj : stackList) {
			System.out.println(obj);
		}
	}
}
