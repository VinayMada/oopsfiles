import java.util.*;
class person{
	protected String name;
	protected String address;
	person(String n,String a){
		name=n;
		address=a;
	}
	String getname(){
		return name;
	}
	String getaddress(){
		return address;
	}
}
class student extends person{
	int numcourses;
	String [] courses=new String[30];
	int [] grades=new int[30];
	int size=0;
	student(String name,String address){
		super(name,address);
	}
	void addcoursegrade(String course,int grade){
		courses[size]=course;
		grades[size]=grade;
		size++;
		return;
	}
	void printgrades(){
		for(int i=0;i<size;i++){
			System.out.println(courses[i]+"->"+grades[i]);
		}
		return;
	}
	double getaveragegrade(){
		int sum=0;
		for(int i=0;i<size;i++){
			sum+=grades[i];
		}
		return sum/2.0;
	}
}
class teacher extends person{
	int numcourses;
	int size=0;
	String [] courses=new String[5];
	teacher(String name,String address){
		super(name,address);
	}
	void addcourse(String course){
		courses[size]=course;
		size++;
	}
	void removecourse(String course){
		int i;
		for( i=0;i<size;i++){
			if(courses[i].equals(course)) break;
		}
		
		for(int j=i;j<size-1;j++){
			courses[j]=courses[j+1];
		}
		size--;
	}
	void print(){
		for(int i=0;i<size;i++){
			System.out.print(courses[i]);
		}
	}
}
class second{
	public static void main(String a[]){
		System.out.print("Enter your name:");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.print("Enter your address:");
		String address=sc.next();
		System.out.print("Enter your role: 1 for student and 2 for teacher:");
		int role=sc.nextInt();
		if(role==1){
			student s=new student(name,address);
			System.out.println("Enter the no of courses (ensure that courses size should not exceed 30):");
			int n=sc.nextInt();
			System.out.println("Enter the course along with their grades:");
			for(int i=0;i<n;i++){
				String course=sc.next();
				int grade=sc.nextInt();
				s.addcoursegrade(course,grade);
				
			}
			s.printgrades();
			System.out.println("Average grade= "+s.getaveragegrade());
		}
		else{
			teacher t=new teacher(name,address);
			System.out.println("Enter the no of courses (ensure that courses size should not exceed 5):");
			int n=sc.nextInt();
			System.out.println("Enter the course:");
			for(int i=0;i<n;i++){
				String course=sc.next();
				t.addcourse(course);
			}
			System.out.println("Enter the course to be removed:");
			String rem=sc.next();
			t.removecourse(rem);
			t.print();
		}
	}
}
