import java.util.*;
class objfunc{
	int value;
	objfunc(){
}
	void display(objfunc f){
		System.out.println("This is call by object");
		System.out.println(f.value);
	}
}
class fun{
fun(){
}
	void display(int x){
		System.out.println("This is call by value");
		System.out.println(x);
	}
}
class valueobject{
	public static void main(String a[]){
		fun f=new fun();
		f.display(4);
		objfunc o=new objfunc();
		o.value=4;
		o.display(o);
	}
}
