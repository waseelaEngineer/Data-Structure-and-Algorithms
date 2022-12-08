import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arrayList {

	public static void main(String[] args) {
		// good for searching and retrieving data
		ArrayList<Integer> nums = new ArrayList<>();    // Declare ArrayList
		
		// assign value in declaration
		List<Integer> a = new ArrayList<>() {{add(3); add(4); add(5);}};
		List<Integer> b = new ArrayList<>(a) {{add(6);}};
		
		//Add two lists
		List<Integer> c = new ArrayList<>();
		c.addAll(a);
		c.addAll(b);
		
		nums.add(1);
//		nums.remove(2);    // remove by index
		nums.remove(Integer.valueOf(2));   // remove by value only needed for integer arrayList
		nums.removeIf(e -> e == 7);    // remove if condition is true
		nums.contains(2);
		nums.isEmpty();
		nums.get(0);
		nums.indexOf(3);
		nums.size();
		nums.set(0, 4);    // (index of old value, new value)
		nums.toArray();
		nums.toString();    // convert to string arrayList
		nums.lastIndexOf(4);   
		nums.clear();
		
		nums.forEach( n -> {
			n += 2;
		});    // do for each element in array
		
	    Iterator<Integer> it = nums.iterator();
	    while(it.hasNext())
	    	System.out.print(it.next());    // do for each element in array
	 
	}

}
