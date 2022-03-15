package Wk8;


public class InsufficientFundsException extends Exception{

	private String error;
	
	public InsufficientFundsException(String error)
	{
	   super(error);
	   this.error=error;
	}

	public String toString()
	{
		return "java.lang.InsufficientFundsException :"+this.error;
	}
	
}
