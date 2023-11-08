import java.util.*; 
public class stat { 
	static int a = 40; 
	int b = 50; 
	void simpleDisplay() 
	{ 
		System.out.println(a); 
		System.out.println(b); 
	} 
	static void staticDisplay() 
	{ 
	System.out.println(a); 
	} 
	public static void main(String[] args) 
	{ 
		stat obj = new stat(); 
		obj.simpleDisplay(); 
		staticDisplay(); 
	} 
}

