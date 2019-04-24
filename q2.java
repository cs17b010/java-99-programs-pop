
import java.util.*; 

public class GFG1 { 
	public static void main(String[] args) throws Exception 
	{ 

		try { 

			
			AbstractSet<Integer> 
				abs_set = new TreeSet<Integer>(); 

		
			abs_set.add(1); 
			abs_set.add(2); 
			abs_set.add(3); 
			abs_set.add(4); 
			abs_set.add(5); 
			System.out.println("AbstractSet: "
							+ abs_set); 
		} 
		catch (Exception e) { 
			System.out.println(e); 
		} 
	} 
} 
