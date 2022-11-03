package string.com;
//6 WAP to demonstrate how memory is allocated to string objects in memory heap and string constant pool.
public class Example6 {
	 public static void main(String[] args)
	    {
	        String s1 = new String("Ram");
	        String s2 = new String("Ram");
	  
	        // Note that this == compares whether
	        // s1 and s2 refer to same object or not
	        if (s1 == s2)
	           System.out.println("Yes");
	        else
	           System.out.println("No");
	    }

}
