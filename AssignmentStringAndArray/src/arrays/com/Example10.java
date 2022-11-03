package arrays.com;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

// 10.sort array on the basis of unit place. For example we are having following numbers
//:- 10,2,3,41,12,13,19,81,9. Output will be 10,41,81,2,12,3,13,19,9.
public class Example10 {
	void contingSort(int array[],int size, int place) {
		int [] output = new int [size+1];
		int max=array[0];
	
		for(int i=1;i<size;i++) {
			if(array[i]>max)
				max=array[i];
			}
		
		int []count = new int [max+1];
		for(int i=0;i<max;++i)
			count[i]=0;
		
		for(int i=0;i<size; i++)
		count[(array[i]/place)%10]++;
		
		for(int i=1;i<10;i++)
			count [i]+=count [i-1];
		
		for(int i=size-1;i>=0;i--) {
			output[count[(array[i]/place)%10]-1]=array[i];
			count[(array[i]/place)%10]--;
			
			}
		for(int i=0;i<size;i++)
			array[i]=output[i];
		}
	int getMax(int array[],int n) {
		int max=array[0];
		for(int i=1;i<n;i++) 
			if(array[i]>max)
				max=array[i];
			return max;
			
		}
		void radixSort(int array[], int size) {
		int max=getMax(array, size);
		
		for(int place=1;max/place>0;place *=100)
			contingSort(array, size, place) ;
	}
		public static void main(String[] args) {
			int []data= {10,2,3,41,12,13,19,81,9};
			int size=data.length;
			
			Example10 rs = new Example10();
			rs.radixSort(data, size);
			System.out.println("Sorting Array: ");
			System.out.println(Arrays.toString(data));
		}
	
	
}
