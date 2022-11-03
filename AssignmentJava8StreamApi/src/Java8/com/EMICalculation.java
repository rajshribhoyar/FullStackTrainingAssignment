/*7. WAP to calculate EMI and print the total number of EMIs for given 
amount, rate of interest and time duration. (Time can also be like this 12 
months, 18 months, 24 months etc).
*/

package Java8.com;

public class EMICalculation {
	public static void main(String[] args) {
		 
		Result r=new Result();
		Calculation c;
		double d=0;
		c=r.emiCalculation();
		d=r.input(c, 1200, 10, 12, 1);
		System.out.println(d);
	}

}
