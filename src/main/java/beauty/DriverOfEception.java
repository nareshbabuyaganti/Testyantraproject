package beauty;

public class DriverOfEception {
	
	public void m1(int i)
	{
		if(i<21)
		{
			throw new NoAgeException();
			
		}
		
	}
	
	public static void main(String[] args) {
		
		DriverOfEception d=new DriverOfEception();
		try 
		{
			d.m1(9);
			
		}
		catch(NoAgeException a)
		{
			System.out.println(a.st);
			
			
		}
		
		
		
	}

}
