import java.util.Deque;
import java.util.LinkedList;

public class deque {

	public static void main(String[] args) {
		// same as queue but can add and delete from start and end
		
		Deque<String> q = new LinkedList<>(); // declare Deque

	    // Add at the last
	    q.add("A");
	    q.addLast("C");
	    q.push("D");
	    q.offer("E");
	    
	    // Add at the first
	    q.addFirst("B");
	    q.offerFirst("F");

	    q.removeFirst();    // remove first
	    q.removeLast();    // remove last	    	    
	}
}
