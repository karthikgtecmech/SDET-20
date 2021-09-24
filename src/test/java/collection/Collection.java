package collection;


import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collection {

	public static void main(String[] args) {
		
		TreeSet tree = new TreeSet();
		
		tree.add(10);
		tree.add(50);
		tree.add(40);
		tree.add(99);
		System.out.println(tree.descendingSet());
		
		 HashMap<Object, Object> map = new HashMap<>();
		 
		 map.put(10, 20);
		 map.put(11, 15);
		 map.put(11, 14);
		 map.put("c", null);
		 
		 System.out.println(map);
		
		 TreeMap treemap = new TreeMap();
		 
		  treemap.put(5, 50);
		  treemap.put(4, 100);
		  treemap.put(2, 150);
		  treemap.put(3, "number");
		  treemap.put(null, "number");
		
		  System.out.println(treemap);
		
	}

}
