import java.util.*;
class circle{
	int radius;
	circle(int r){
		radius=r;
	}
	double getarea(int r){
	return 3.14*r*r;
	}
	double getperimeter(int r){
	return 2*3.14*r;
	}
}
class circle5{
	public static void main(String a[]){
			Scanner sc=new Scanner(System.in);
			int radius=sc.nextInt();
			circle c=new circle(radius);
			System.out.println("Area of the circle :"+c.getarea(radius));
			System.out.println("Area of the circle :"+c.getperimeter(radius));
	}
}
