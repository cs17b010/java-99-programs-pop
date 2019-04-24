import java.util.*; 

public class GFG 
{ 
	public static void main(String[] args) 
	{ 
		List<String> myAlist = new ArrayList<String>(); 
		myAlist.add("Geeks"); 
		myAlist.add("Practice"); 
		myAlist.add("Quiz"); 
		System.out.println("Original ArrayList : " + myAlist); 
		myAlist.remove("Quiz"); 
		System.out.println("Modified ArrayList : " + myAlist); 

		List<String> myLlist = new ArrayList<String>(); 
		myLlist.add("Geeks"); 
		myLlist.add("Practice"); 
		myLlist.add("Quiz"); 
		System.out.println("Original LinkedList : " + myLlist); 
		myLlist.remove("Quiz"); 
		System.out.println("Modified LinkedList : " + myLlist); 
	} 
} 
