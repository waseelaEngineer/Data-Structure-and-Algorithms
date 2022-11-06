import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<String>();    // Declare Queue 
		
		
		q.add("A");    // add element or throw exception if not possible
		q.offer("B");    // add element or do noting if not possible
		
		q.element();    // retrieve head of queue or throw error if not existed
		q.peek();    // retrieve head of queue or return null if not existed
		
		q.remove();    // remove head of queue or throw error if not existed
		q.poll();    // remove head of queue or return null if not existed
		
		q.size();    // return size of queue
		q.contains("B");    // check if the element exist in the queue
		q.toArray();    // convert queue to array
	}
}
