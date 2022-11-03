package collection.com;
//1) WAP to sort Collection elements in ascending order.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {

		String list[] = { "Raji", "Prachi", "Amit", "Sona", "Gaurav" };

		List ll = new ArrayList(Arrays.asList(list));

		Collections.sort(ll);

		System.out.println("Ascending Order " + ll);

	}
}