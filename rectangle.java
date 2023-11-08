import java.util.*;
class rectangle{
	int length;
	int breadth;
	rectangle(){
		length=0;
		breadth=0;
	}
	int getarea(){
		return length*breadth;
	}
	int getperimeter(){
		return 2*(length+breadth);
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		rectangle r=new rectangle();
		r.length=sc.nextInt();
		r.breadth=sc.nextInt();
		System.out.println(r.getarea());
		System.out.println(r.getperimeter());
	}
}
