package string.com;
//4 WAP to print the number of alphabets repeated in the given string.
public class Example4 {
	public static void main(String[] args) {
		
		
		String str = "beautiful beach";
	      char[] carray = str.toCharArray();
	      
	      System.out.println("The string is:" + str);
	      System.out.print("Duplicate Characters in above string are: ");
	      
	      for (int i = 0; i < str.length(); i++)
	      {
	         for (int j = i + 1; j < str.length(); j++)
	         {
	            if (carray[i] == carray[j]) 
	            {
	               System.out.print(carray[j] + " ");
	               break;
	            }
	         }

	      }
	}
}