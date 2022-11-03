/*6) WAP to store data in hashmap. Keys are the city name and values are the population. 
Now you have to sort the all elements (on the basis of city name ) in hashmap and 
print the detail.*/

package collection.com;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example6 {

	static Map<String, Integer> map = new HashMap<>();

	public static void sortbykey() {
		TreeMap<String, Integer> sorted = new TreeMap<>(map);

		for (Map.Entry<String, Integer> entry : sorted.entrySet())
			System.out.println(
					"Sorting The City Name: " + entry.getKey() + ", City Population In 2022: " + entry.getValue());

	}

	public static void main(String[] args) {

		map.put("Mumbai", 20961000);
		map.put("Pune", 6987000);
		map.put("Gondia", 1415146);
		map.put("Nagpur", 2991000);
		map.put("Goa", 1542750);
		map.put("Bhandara", 1284415);
		map.put("Amravati", 778000);

		sortbykey();

	}
}
