import java.util.*;
class vowels{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int v_count=0,c_count=0;
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
				System.out.print(c+" ");
				v_count++;
			}
			else c_count++;
		}
		System.out.println();
		System.out.println("Total vowels are "+v_count);
		System.out.println("Total consonants are "+c_count);
	}
}
