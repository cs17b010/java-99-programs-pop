import java.util.*; 
class HashMapDemo 
{ 
	public static void main(String args[])throws Exception 
	{ 
		HashMap m = new HashMap(); 
		Demo d = new Demo(); 
		
		
		m.put(d," Hi "); 
		
		System.out.println(m); 
		d = null; 
		
		
		System.gc(); 
		Thread.sleep(4000); 
		
		System.out.println(m); 
		} 
	} 
	class Demo 
	{ 
		public String toString() 
		{ 
			return "demo"; 
		} 
		
		public void finalize() 
		{ 
			System.out.println("Finalize method is called"); 
		} 
} 
