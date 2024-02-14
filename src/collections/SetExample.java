package collections;
import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		
		
		
		HashSet<String> set1 = new HashSet<String> ();
		set1.add("Apoorv");
		set1.add("Ajay");
		set1.add("Abhay");
		set1.add("Raghu");
		set1.add("Raghu");  // We can write but it'll not take Raghu name twice as duplicate not allowed.
//		set1.add(null);  // We can add null in set. NO DUPLICATE VALUES ALLOWED UNLIKE ARRAYLIST. SET DOES NOT MAINTAIN INSERTION ORDER.
		
		System.out.println(set1);
		
//		Collections.sort(set1);  it'll not work, Collection.sort() works with only lists.
		
		
		TreeSet<String> set2 = new TreeSet<String> ();  // TreeSet always add elements in sorted order, 
		set2.add("Navya");
		set2.add("Sunita");
		set2.add("Aish");
		set2.add("Rasha");
		
		System.out.println(set2);
		
		// Converting set into list- 
		ArrayList<String> list1 = new ArrayList<String> (set1);   //We can convert set into list by simply passing set object into ArrayList like this
		System.out.println(list1);
		
	}

} 
