import java.lang.*; 

public class Geeks { 

	public static void main(String[] args) 
	{ 

		StringBuffer sbf = new StringBuffer("Geeksforgeeks"); 
		System.out.println("String buffer = " + sbf); 

		sbf.appendCodePoint(65); 
		System.out.println("After appending CodePoint is = " + sbf); 
	} 
} 
