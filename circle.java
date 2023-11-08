import java.util.*;
class circle{
	int radius;
	String color;r
	double getarea(){
		return 3.14*radius*radius;
	}
	Boolean fillcolor(){
		if(color!="") return true;
		return false;
	}
	double getarea(int radius){
		return 3.14*radius*radius;
	}
	Boolean fillcolor(String color){
		if(color!="") return true;
		return false;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		circle c=new circle();
		c.radius=sc.nextInt();
		c.color=sc.next();
		System.out.println(c.getarea());
		System.out.println(c.fillcolor());
		System.out.println(c.getarea(4));
		System.out.println(c.fillcolor("green"));
	}
}

