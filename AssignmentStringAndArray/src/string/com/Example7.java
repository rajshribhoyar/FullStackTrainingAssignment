package string.com;

//7 WAP to demonstrate how garbage collector work when any memory is not referenced by string object.

public class Example7 {
	
	
	    public void finalize()
	    {
	        System.out.println ("Garbage Collection performed by JVM");
	    }
	    public static void main (String args[])
	    {
	    	Example7 s1 = new Example7 ();
	    	Example7 s2 = new Example7 ();
	        s1 = null;
	        s2 = null;
	        System.gc();
	    }
	}


