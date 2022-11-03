package arrays.com;
//6  WAP to find the LCM and HCF of array numbers.
import java.util.Scanner;

public class Example6 
{
	public static void main(String[] args){
      int a, b, gcd;
      Scanner s = new Scanner(System.in);

      System.out.print("Enter the Two Numbers: ");
      	a = s.nextInt();
      	b = s.nextInt();

      		gcd = a;

      		while(true)
      		{
      			if((a%gcd==0) && (b%gcd==0))
      				break;
      			else
      				gcd--;
      		}

      		System.out.println("\nHCF of Given Two Number = " +gcd);
      		
      		
      		
      		int[] myArray = {25, 50, 125, 625};
  	      int min, max, x, lcm = 0;
  	     
  	      for(int i = 0; i<myArray.length; i++) {
  	         for(int j = i+1; j<myArray.length-1; j++) {
  	            if(myArray[i] > myArray[j]) {
  	               min = myArray[j];
  	               max = myArray[i];
  	            } else {
  	               min = myArray[i];
  	               max = myArray[j];
  	            }
  	            for(int k =0; k<myArray.length; k++) {
  	               x = k * max;
  	               if(x % min == 0) {
  	                  lcm = x ;
  	               }
  	            }
  	         }
  	      }
  	      System.out.println("LCM of the given array of numbers : " + lcm);
  	   }
	}


