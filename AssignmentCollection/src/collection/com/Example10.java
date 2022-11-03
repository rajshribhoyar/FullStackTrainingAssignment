/*10) Suppose that you are given the In-Order traversal of the Binary Search Tree in the 
form of ArrayList or Array. Now your task is that you have create a new ArrayList or 
Array for the In-Order traversal of Binary Search Tree where all duplicates are 
removed.
*/

package collection.com;

//Node declaration
class Node
{
 int data;
 public Node left;
 public Node right;
 Node(int data)
 {
     this.data = data;
     left = right = null;
 }
}
public class Example10 {
	 public static Node insert(Node root, int data)
	    {
	        if (root == null)
	            return new Node(data);
	        if (data < root.data)
	            root.left = insert(root.left, data);
	        if (data > root.data)
	            root.right = insert(root.right, data);
	        return root;
	    }
	 
	    // InOrder function to display value of array
	    // in sorted order
	    public static void inOrder(Node root)
	    {
	        if (root == null)
	            return;
	        inOrder(root.left);
	        System.out.print(root.data+" ");
	        inOrder(root.right);
	    }
	public static void main(String[] args) {
		int arr[] = {1,2,3,2,5,4,4,8,8,7,2,7,9,6,9,10,10 };
		 
        // Finding size of array arr[]
        int n = arr.length;
 
        Node root = null;
        for (int i = 0; i < n; i++)
        {
            // Insert element of arr[] in BST
            root = insert(root,arr[i]);
        }
 
        // Inorder Traversal to print nodes of Tree
        inOrder(root);
    
		
	}
	

}
