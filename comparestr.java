import java.util.*;
class comparestr{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String str=sc.next();
		if(s.compareTo(str)==0){
			System.out.println("Strings are equal");
		}
		else{
			System.out.println("Strings are not equal");
		}
	}
}
