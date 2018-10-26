package co.com.fincaraiz.AssertionError;

public class NetworkFailure extends AssertionError{
	
	public static String NO_CONNECTION ="There is not connection network";
	
	public NetworkFailure(String ErrorMessage,Throwable cause)
	{
		super(ErrorMessage,cause);
	}

}
