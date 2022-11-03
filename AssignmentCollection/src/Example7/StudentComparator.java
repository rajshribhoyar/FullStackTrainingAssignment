package Example7;

import java.util.Comparator;

public class StudentComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student) o1;
		Student s2=(Student) o2;
		
		int m1=s1.getTotalmarks();
		int m2=s2.getTotalmarks();
		
		if(m1<m2)
			return 1;
		else if(m1>m2)
			return -1;
		else
		return 0;
	}

}
