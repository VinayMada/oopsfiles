import java.util.*;
class revstr{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rev=new String();
		for(int i=s.length()-1;i>=0;i--){
			rev+=s.charAt(i);
		}
		System.out.println("Reversed string is "+rev);
	}
}
