package arrays.com;

//5. Suppose that you are having an array of size N. now your task is to sort the 
//half array that is from 0 to N/2 in ascending order and N/2+1 to N in descending order.
public class Example5 {
	// function to print half of the array in
	   // ascending order and the other half in
	   // descending order
	   static void printOrder(int[] a, int n)
	   {
	     int temp;
	     for(int i=0;i < n-1;i++)
	     {
	        for(int j = 0;j < n/2; j++) { if(a[j]>a[j+1])
	            {
	              temp=a[j];
	              a[j]=a[j+1];
	              a[j+1]=temp;
	            }
	        }

	        for(int j = n/2;j < n-1; j++)
	        {
	            if(a[j] < a[j+1])
	            {
	               temp=a[j];
	               a[j]=a[j+1];
	               a[j+1]=temp;
	            }
	         }
	      }

	      for(int i = 0; i < n; i++)
	         System.out.print(a[i] + " ");

	   }

	   // Driver code
	   public static void main(String[] args)
	   {
	       int[] arr = {3, 2, 4, 1, 10, 30, 40, 20};
	       int n = arr.length;
	       printOrder(arr, n);
	    }
	}


