import java.util.HashSet;
import java.util.Iterator;

public class hashSet {

	public static void main(String[] args) {

		HashSet<String> h = new HashSet<>();    // Declare HashSet
		
		h.add("A");
		h.remove("B");
		h.clear();
		h.size();
		h.contains("B");
		h.isEmpty();
		h.toArray();
		
		Iterator<String> it = h.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}    // iterate throw map
		
		for (Object n : h.toArray()) {
			System.out.println(n);
		}    // do for each element in set
	}
}
