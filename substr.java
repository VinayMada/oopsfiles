import java.util.*;
class substr{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.next();
		System.out.println("Enter the starting index: ");//inclusive
		int startsWith=sc.nextInt();
		System.out.println("Enter the ending index: ");//exclusive
		int endsWith=sc.nextInt();
		System.out.println("Substring is "+s.substring(startsWith,endsWith));
	}
}
