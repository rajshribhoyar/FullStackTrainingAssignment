/*1) WAP to take student marks of different subject in class StudentResult which is associated with 
Student class in following way:-
Class Student{
Int rollno; String sname;String saddress;StudentResult srobj;Setter and getter for all class variable.}
Create your own Exception class with name ResultException. This exception will be thrown when 
user is failed in more than 1 subject. 
You also need to throw exception when user mistakenly input the negative marks. 
If user total score is less than 40% you need to through fail exception.*/


package JavaException1;

public class ResultException extends RuntimeException{
	
	public ResultException(String s) {
		
		super(s);
	}

}
