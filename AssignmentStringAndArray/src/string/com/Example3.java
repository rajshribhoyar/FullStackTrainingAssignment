package string.com;
//3   WAP to remove all the vowels from the given string.
public class Example3 {
	public static void main(String[] args) {
		
	
	String s="abcdefghijklmnopqrstuvwxyz";
	String s1 ="";
	s1=s.replaceAll("[aeiou]", "");
	System.out.println("String after remove Vowels:-  "+s1);

}
}