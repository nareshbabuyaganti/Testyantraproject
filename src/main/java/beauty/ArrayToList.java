package beauty;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {
	
	public static void main(String[] args) {
		
	
		int ar[]= {2,4,6,7,8,9,10,67,56,45};

		List<Integer> l2=m1(ar);
	
		for(Integer i1:l2)
			{
				int i2=i1;
				
				System.out.println(i2);
			}
		
		
	}
	
	public static List<Integer> m1(int ar[])
	{
	
		
		List<Integer> l1=new ArrayList<Integer>();
		
		for(int i=0;i<ar.length;i++)
		{
			l1.add(ar[i]);
			
		}
		return l1;
		

		
	}

}
