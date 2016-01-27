package stack;

public class Launcher {

	public static void main(String[] args) {
		 Stack s = new Stack();
	        s.push("1");
	        s.push("2");
	        s.push("3");
	        s.push("4");

	        s.printList();
	        System.out.println("...");
	        s.pop();
	        s.printList();
	    }

	}


