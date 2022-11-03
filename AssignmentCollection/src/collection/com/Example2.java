//2) WAP to store all Collection elements in Array and perform the Binary Search
package collection.com;

import java.util.ArrayList;
import java.util.Collections;


public class Example2 {
	public static void main(String[] args) {
		ArrayList el=new ArrayList();
		el.add(1);
		el.add(3);
		el.add(5);
		el.add(2);
		el.add(6);
		
		Integer search = Collections.binarySearch(el, 5)	;
		
		if (search!=-1) {
			System.out.println("Elements Present in the list:" +(search+1));
			
		}else {
			System.out.println("Element Not Present in List:");
		}
		
		
	}

}
