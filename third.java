import java.util.*;
abstract class monster{
	String name;
	abstract void attack();
}
class firemonster extends monster{
	void attack(){
		name="fire";
	}
}
class watermonster extends monster{
	void attack(){
		name="water";
	}
}
class stonemonster extends monster{
	void attack(){
		name="stone";
	}
}
class third{
	public static void main(String args[]){
		monster n=new firemonster();
		n.attack();
		System.out.println(n.name);
		monster m=new watermonster();
		m.attack();
		System.out.println(m.name);
		monster l=new stonemonster();
		l.attack();
		System.out.println(l.name);
	}
}
