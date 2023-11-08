import java.util.*;
class thiss{
	int a;
	void initial(int a){
		this.a=a;
		System.out.println(this.a);
	}
	public static void main(String args[]){
		thiss t=new thiss();
		t.initial(9);
	}
}
