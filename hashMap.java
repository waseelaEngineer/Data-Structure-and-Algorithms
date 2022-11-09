import java.util.HashMap;
import java.util.Map;

public class hashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();    // Declare HashMap
		map.put(1, "A");    // add to map and replace if exist
		map.putIfAbsent(3, "F");     // add to map if not exist
		
		map.remove(2);    // remove by key
		map.containsValue("C");    // return boolean if value exist
		map.containsKey(3);    // return boolean if key exist
		map.size();
		map.replace(1, "AA");    // update value
		map.values();    // all values in map
		map.keySet();    // all keys in map
		map.clear();
		map.isEmpty();    // return boolean
				
		map.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});    // loop for each key and value in map
				
		for(Map.Entry m: map.entrySet()){    
	        System.out.println(m);    
	    }    // loop for each entry in map
		
		for(String s: map.values()){    
	        System.out.println(s);    
	    }    // loop for each value in map (could be for keys too)
	}
}
