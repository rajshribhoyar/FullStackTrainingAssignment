/*1. WAP to check the given no is palindrome or not. Don’t use divide 
method.*/

package Java8.com;

public class CheckPalindromeNumber {
	public static void main(String[] args) {
		int num = 123321, rev = 0, remainder;

		int originalNum = num;

		while (num != 0) {
			remainder = num % 10;
			rev = rev * 10 + remainder;
			num /= 10;
		}
		if (originalNum == rev) {
			System.out.println("This Is Palindrome Numbers: "+originalNum);
		} else {
			System.out.println("This Is Not Palodrome Numbers: "+originalNum);
		}

	}

}
