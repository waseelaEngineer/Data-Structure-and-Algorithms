import java.util.Iterator;
import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		/*
		 * contain duplicate
		 * maintain insertion order
		 * fast in manipulation such as add and remove
		 * can be used as a list, stack, queue
		 */
		
		LinkedList<String> list = new LinkedList<>();
		list.add("apple");
		list.remove("orange");
		list.get(0);    // get by index
		list.getFirst();
		list.isEmpty();
		list.size();
		list.clear();
		
		// do for each element in list
		Iterator<String> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		for (Object n : list.toArray())
			System.out.println(n);
		
	}

}
