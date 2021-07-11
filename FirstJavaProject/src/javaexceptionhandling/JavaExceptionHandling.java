package javaexceptionhandling;

public class JavaExceptionHandling {
	
	public static void main(String[] args) {
		
		try {
		// try block is for the code where exception are present 
			
			System.out.println("learning exception handling");
			int i=1/0;
			System.out.println("this message is after exception");
			
	   } 
		catch (Exception e) {
		// catch block is to handle the exception 
			
		System.out.println ("exception message is:" +e.getMessage());
		System.out.println ("exception cause is:" +e.getCause());
		System.out.println ("exception details is:" +e.fillInStackTrace());
		e.printStackTrace();
		
		}
		finally {
		
		 System.out.println("Finally block");
		}
		
		
	}

}
