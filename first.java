import java.util.*;
class shape{
	shape(){
		System.out.println("This is shape class");
	}
	int getarea(){
		System.out.println("This is parent class getarea method");
		return 0;
	}
	int getperimeter(){
		System.out.println("This is parent class getperimeter method");
		return 0;
	}
}
class rectangle extends shape{
	int length,breadth;
	rectangle(int l,int b){
		length=l;
		breadth=b;
	}
	int getarea(){
		super.getarea();
		return length*breadth;
	}
	int getperimeter(){
		super.getperimeter();
		return 2*(length+breadth);
	}
}
class square extends shape{
	int side;
	square(int s){
		side=s;
	}
	int getarea(){
		super.getarea();
		return side*side;
	}
	int getperimeter(){
		super.getperimeter();
		return 4*side;
	}
}
class circle extends shape{
	int radius;
	circle(int r){
		radius=r;
	}
	int getarea(){
		super.getarea();
		return (int)3.14*(radius*radius);
	}
	int getperimeter(){
		super.getperimeter();
		return (int)2*((int)3.14*radius);
	}
}
class first{
	public static void main(String a[]){
		int length,breadth;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of the rectangle:");
		length=sc.nextInt();
		System.out.println("Enter breadth of the rectangle:");
		breadth=sc.nextInt();
		rectangle r=new rectangle(length,breadth);
		System.out.println("Area of the rectangle: "+r.getarea());
		System.out.println("Perimeter of the rectangle: "+r.getperimeter());
		System.out.println("Enter side of the square:");
		int side=sc.nextInt();
		square s=new square(side);
		System.out.println("Area of the square: "+s.getarea());
		System.out.println("Perimeter of the square: "+s.getperimeter());
		System.out.println("Enter radius of the circle:");
		int radius=sc.nextInt();
		circle c=new circle(radius);
		System.out.println("Area of the circle: "+c.getarea());
		System.out.println("Perimeter of the circle: "+c.getperimeter());
	}
}
