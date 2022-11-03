//5) WAP to store data related to item in Vector and after that sort the data.
package collection.com;

import java.util.Collections;
import java.util.Vector;

public class Example5 {
	public static void main(String[] args) {
		Vector<String>vc=new Vector<String>();
		
		vc.add("Ram");
		vc.add("Anu");
		vc.add("Banu");
		vc.add("siya");
		vc.add("Tinu");
		vc.add("Manshi");
		
		System.out.println("Before Sorting Vector:"+vc);
		
		Collections.sort(vc);
		System.out.println("After Sorting Vector:"+vc);
	}

}
