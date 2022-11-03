package arrays.com;

//1.find third maximum number from list of numbers.

public class Example1 {
	public static void main(String args[]){
		   int temp, size;
		   int array[] = {10, 20, 25, 63, 96, 57};
		   size = array.length;
		   
		   for(int i = 0; i<size; i++ ){
		      for(int j = i+1; j<size; j++){
		         if(array[i]>array[j]){
		            temp = array[i];
		            array[i] = array[j];
		            array[j] = temp;
		         }
		      }
		   }
		   System.out.println("Third largest number is:: "+array[size-3]);
		   }

}
