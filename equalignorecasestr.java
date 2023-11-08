import java.util.*;
class equalignorecasestr{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String str=sc.next();
		if(s.equalsIgnoreCase(str)){
			System.out.println("Strings are equal");
		}
		else{
			System.out.println("Strings are not equal");
		}
	}
}
