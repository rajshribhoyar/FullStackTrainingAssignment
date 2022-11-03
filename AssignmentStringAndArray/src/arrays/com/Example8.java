package arrays.com;

// 8.User will enter the element in M*M order matrix that is square matrix now you have to print first row, last row, first column, and last column elements. Code should be applicable for matrix of any order. You are having array of strings. Now you have to arrange strings in array on the basis of the length of each string. Smallest string will be first and so on.

public class Example8 {
	static int n = 4;
	 
    static void interchangeFirstLast(int m[][])
    {
        int cols = n;
 
        // swapping of element between first
        // and last columns
        for (int i = 0; i < n; i++) {
            int t = m[i][0];
            m[i][0] = m[i][n - 1];
            m[i][n - 1] = t;
        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
        // input in the array
        int m[][] = { { 8, 9, 7, 6 },
                      { 4, 7, 6, 5 },
                      { 3, 2, 1, 8 },
                      { 9, 9, 7, 7 } };
 
        // Function call
        interchangeFirstLast(m);
 
        // printing the interchanged matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }

}
