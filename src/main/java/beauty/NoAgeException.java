package beauty;

public class NoAgeException extends RuntimeException {
	
	String st="age in currect";
	
	public NoAgeException() {
		
	}
	
	
	public  String getMessage()
	{
		return st;
		
	}

}
