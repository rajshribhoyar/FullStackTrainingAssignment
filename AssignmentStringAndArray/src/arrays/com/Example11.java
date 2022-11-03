/*An Array contain the n numbers you have to find out combination which satisfy
Pythagoras Template. ( Pythagoras templates:- 3*3+4*4==5*5)*/

package arrays.com;

public class Example11 {

    static void pythagorasTemplate(int limit) {
    	int a,b,c=0;
    	int m=2;
    	while(c<limit) {
    		for(int n=1;n<m;++n) {
    			a=m*m-n*n;
    			b=2*m*n;
    			c=m*m+n*n;
    			
    			if(c>limit)
    				break;
    			System.out.println(a+ " + " +b+ " = " +c);
    			
    			
    		}
    		m++;
    	}
    }
public static void main(String[] args) {
	int limit =10;
	pythagorasTemplate(limit);
}
}

