package beauty;

import java.net.MulticastSocket;

public class DebugDemo {
	
	public static void main(String[] args) {
		System.out.println("main start()");
		m1();
		System.out.println("************");
		m2();
		System.out.println("***********");
		String st=m4();
		System.out.println(st);
		
		System.out.println("main end()");
		
	}
	
	public static void m1()
	{
		int a2=1;
		
		System.out.println("from m1()");
	}
	public static int m2()
	{
		System.out.println("form m2()");
		return m3();
	}
	public static int  m3()
	{
		int a1=10;
		
		System.out.println("form m3()");
		return a1;
		
	}
	public static String m4()
	{
		System.out.println("from m4()");
		return "naresh";
		
		
	}

}
