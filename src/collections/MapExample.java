package collections;
import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		
		HashMap<String,Integer> basket = new HashMap<String,Integer> (); // Here string is key, integer is value
		basket.put("Item1", 1);
		basket.put("Item2", 5);
		basket.put("Item3", 2);
		basket.put("Item4", 2);  // We can have duplicate values but keys are unique in HashMap
		
		System.out.println(basket);
		
		basket.put("Item3", 4);   // It'll not create new entity, but will update above item3 entity
		System.out.println("The map after change: "+basket);
		
		basket.remove("Item2");
		System.out.println(basket);
		
		basket.put("Item5", null);  // Values can be null in HashMap,
		System.out.println(basket);
		
		basket.put(null, 4);  // Key can also be null but we can put null in key only once. RARE CASE
		System.out.println(basket);
		
		
		
		for(String item : basket.keySet())  // We can either iterate through KeySet or Values for HashMap
		{
			System.out.println("Item name is: "+item);
			System.out.println("Item quantity is: "+basket.get(item));
		}
		
		for(Integer val : basket.values())  
		{
			System.out.println("The value is: "+val);
		}
		
		// We can use TreeMap also that sorts the data
		
		// BELOW IS LOGIC FOR PRINTING FREQUENCY OF EACH WORD OF A STRING------------------------
		
		String str = "Clean World Green World Happy World";
		String arr1[] = str.split(" ");
		
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		
		HashMap<String,Integer> map2 = new HashMap<String,Integer> ();
		for(String word : arr1)
		{
			if( ! map2.keySet().contains(word))
			{
				map2.put(word, 1);
			}
			else
			{
				map2.put(word, map2.get(word) + 1);
			}
		}
		System.out.println("The resulting map is: "+map2);
	
	}
}
