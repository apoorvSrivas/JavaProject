package collections;
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		ArrayList<String> list1 = new ArrayList<String> ();
		list1.add("Apoorv");
		list1.add("Vedika");
		list1.add("Sarvesh");
		list1.add("Ajay");
		list1.add("Ajay");   // Duplicate values are allowed in ArrayList. In Set, we can. 
	//	list1.add(null);   // null allowed in list, however, IF WE ADD NULL IN LIST, THEN WE CAN'T USE COLLECTION.SORT() METHOD LIKE BELOW. 
		
		System.out.println(list1);
		System.out.println(list1.size());
		System.out.println(list1.get(1));
		System.out.println(list1.get(list1.size()-1));
		
		list1.add(2, "Shubham");  // It'll add another element in 2nd index and next elements will shift further
		System.out.println(list1);
		
		list1.set(3, "Tushar");  // It'll replace/update element at index 3
		System.out.println(list1);
		
		list1.remove(3);
		System.out.println(list1);
		
		//Iterate through the list
		
		for(int i=0; i<list1.size(); i++)
		{
			System.out.println(list1.get(i));
		}
		
		for(String value : list1)
		{
			System.out.println(value);
		}
		
		
		Iterator<String> itr = list1.iterator();   // Iterator is an object in java which can be used to iterate through collections. We can create object of class Iterator and assign it to Iterator method like  list1.Iterator();		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		Collections.sort(list1);  // It'll sort
		System.out.println("List after sorting: "+list1);
		
		Collections.sort(list1, Collections.reverseOrder());   // Reverse order sorting will work ONLY IF LIST IS SORTED FIRST.
		System.out.println("Reverse order is: "+list1);
	
		

	}

}
