class Test2 {	 
	public static void main(String[] args) {	 
		Test1 t1 = new Test1(); 
		t1.fun(5);		 
	} 
}	 
class Test1 { 
	void fun(int x) { 
		System.out.println("fun() called: x = " + x); 
	} 
} 
