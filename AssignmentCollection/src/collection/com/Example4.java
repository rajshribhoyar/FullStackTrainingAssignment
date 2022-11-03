/*4) WAP to store elements in List and remove all duplicates names of items. After 
duplicates are removed print all elements in descending order.*/

package collection.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Example4 {
	public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(7);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(10);
        
        Arrays.asList(list);
        System.out.println("Array list with duplicates "+list);
        
        Set<Integer> s = new LinkedHashSet<Integer>();
        s.addAll(list);
        
        list.clear();
        list.addAll(s);
        System.out.println("Array list without duplicate elements "+list);
        Collections.sort(list);
        System.out.println("Ascending order "+list);
        Collections.reverse(list);
        System.out.println("Descending Order:"+list);
        
        
    }

}
