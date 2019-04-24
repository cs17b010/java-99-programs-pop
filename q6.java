
import java.io.*; 
import java.util.*; 

class GFG 
{ 
	public static void main (String[] args) 
	{ 
		
		ArrayList<String> al = new ArrayList<String>(); 

		
		al.add("Practice.GeeksforGeeks.org"); 
		al.add("quiz.GeeksforGeeks.org"); 
		al.add("code.GeeksforGeeks.org"); 
		al.add("contribute.GeeksforGeeks.org"); 

		
		System.out.println("ArrayList elements are:"); 
		Iterator it = al.iterator(); 
		while (it.hasNext()) 
			System.out.println(it.next()); 

		
		Vector<String> v = new Vector<String>(); 
		v.addElement("Practice"); 
		v.addElement("quiz"); 
		v.addElement("code"); 

		
		System.out.println("\nVector elements are:"); 
		Enumeration e = v.elements(); 
		while (e.hasMoreElements()) 
			System.out.println(e.nextElement()); 
	} 
} 
