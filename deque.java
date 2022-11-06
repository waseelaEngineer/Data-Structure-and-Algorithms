import java.util.Deque;
import java.util.LinkedList;

public class deque {

	public static void main(String[] args) {
		// same as queue but can add and remove from start and end
		
		Deque<String> q = new LinkedList<>(); // declare Deque

	    // Add at the last
	    q.add("A");    // add element or throw exception if not possible
	    q.addLast("C");
	    q.offer("E");   // add element or do nothing if not possible
	    q.offerLast("F");
	    
	    // Add at the first
	    q.addFirst("B");
	    q.offerFirst("F");
	    q.push("D");
	    
	    // retrieve at the last
	    q.peekLast();
	    
	    // retrieve at the first
	    q.element();    // retrieve head of queue or throw error if not existed
	    q.peek();    // retrieve head of queue or return null if not existed
	    q.peekFirst();

	    // remove at the last
	    q.removeLast();    
	    q.pollLast();
	    
	    // remove at the first
	    q.remove();    // remove head of queue or throw error if not existed
	    q.removeFirst();
	    q.poll();    // remove head of queue or return null if not existed
	    q.pollFirst();
	    
	    // methods
	    q.size();
	    q.contains("A");
	    q.toArray();
	}
}
