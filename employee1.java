import java.util.*;
class employee{
	String f_name,l_name;
	employee(String m,String n){
		f_name=m;
		l_name=n;
	}
	String getfirstname(){
		return f_name;	
	}
	String getlastname(){
		return l_name;
	}
}
class contract_E extends employee{
	String dept,desg;
	
	contract_E(String m,String n){
		super(m,n);
	}
	void displayfullname(){
		System.out.println("Fullname: "+f_name+l_name);
	}
	String getdept(){
		return dept;
	}
	String getdesig(){
		return desg;
	}
}
class regular_E extends employee{
	String dept,desg;
	regular_E(String m,String n){
		super(m,n);
	}
	void displayfullname(){
		System.out.println("Fullname: "+f_name+l_name);
	}
	String getdept(){
		return dept;
	}
	String getdesig(){
		return desg;
	}
}
class weekly_E extends contract_E {
	int no_of_weeks,wages_per_week;
		weekly_E(String m,String n){
		super(m,n);
	}
	int calcwages(){
		return no_of_weeks*wages_per_week;
	}
}
class hourly_E extends contract_E{
	int no_of_hrs,wages_per_hr;
	hourly_E(String m,String n){
		super(m,n);
	}
	int calcwages(){
		return no_of_hrs*wages_per_hr;
	}
}
class employee1{
	public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			String f_name=sc.next();
			String l_name=sc.next();
			contract_E c=new contract_E(f_name,l_name);
			c.dept="CSE";
			c.desg="HoD";
			c.displayfullname();
			System.out.println("Department: "+c.getdept());
			System.out.println("Designation: "+c.getdesig());
			weekly_E w=new weekly_E(f_name,l_name);
			w.no_of_weeks=7;
			w.wages_per_week=18000;
			System.out.println("Salary: "+w.calcwages());
			hourly_E h=new hourly_E(f_name,l_name);
			h.no_of_hrs=7;
			h.wages_per_hr=1800;
			System.out.println("Salary: "+h.calcwages());
	}
}
