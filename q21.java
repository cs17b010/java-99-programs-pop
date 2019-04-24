class Test 
{ 
	final int i; 

	Test(int x) 
	{ 
		i = x; 
	} 
} 

class Main 
{ 
	public static void main(String args[]) 
	{ 
		Test t1 = new Test(10); 
		System.out.println(t1.i); 

		Test t2 = new Test(20); 
		System.out.println(t2.i); 
	} 
} 
