package co.com.fincaraiz.AssertionError;

public class FailDescription extends AssertionError{

	public FailDescription(String message,Throwable cause) {
		super(message,cause);
		
	}
	public static String FailDescription (String description) {
		return String.format("The user can't see the location of the property ",description);
		
	}
}
