package string.com;
// 2   WAP to print the all alphabets of string in ascending and descending order.
public class Example2 {
	public static void main(String[] args) {
		String str="rajshri";
		char arr[]=str.toCharArray();
		char temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if (arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			}
		}
		System.out.print("Elements Of Ascending Order:  ");
		System.out.print(new String(arr));
	}

}
