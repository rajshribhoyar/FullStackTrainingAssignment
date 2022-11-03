package arrays.com;

//4  An Array Contain different numbers you have to find how many are even, odd, perfect and prime

public class Example4 {
	static void CountingEvenOdd(int arr[], int arr_size)
    {
        int even_count = 0;
        int odd_count = 0;
 
        // loop to read all the values in
        // the array
        for (int i = 0; i < arr_size; i++) {
             
              // checking if a number is
            // completely divisible by 2
            if ((arr[i] & 1) == 1)
                odd_count++;
            else
                even_count++;
        }
 
        System.out.println("\n Number of even"
                           + " elements = " + even_count
                           + "\n Number of odd elements = "
                           + odd_count);
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = { 2, 3, 4, 5, 6 };
        int n = arr.length;
           
          // Function Call
        CountingEvenOdd(arr, n);
    }
}
