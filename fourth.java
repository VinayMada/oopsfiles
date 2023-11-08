import java.util.*;
class vehicle{
	String company,model;
	int mileage,fuel_capacity,displacement;
}
class two_wheeler extends vehicle{
	String front_brake,rear_brake,tyre_type,head_lamp,user_reviews;
	void display(){
		System.out.print(company+" 			"+model+" 			"+mileage+" 		"+fuel_capacity+" 		"+displacement+" 		"+front_brake+" 		"+rear_brake+" 		"+tyre_type+" 		"+head_lamp+" 		"+user_reviews);
	}
}
class four_wheeler extends vehicle{
	boolean air_bags,power_steering,rain_sensing_wiper,air_conditioner;
	void display(){
		System.out.print(company+" 			"+model+" 			"+mileage+" 		"+fuel_capacity+" 			"+displacement+" 			"+air_conditioner+" 		"+air_bags+" 			"+power_steering+" 			"+rain_sensing_wiper);
	}
}
class fourth{
	public static void main(String args[]){
		System.out.println("Two wheelers:");
		two_wheeler v1=new two_wheeler();
		v1.company="TVS";
		v1.model="star city";
		v1.mileage=60;
		v1.fuel_capacity=5;
		v1.displacement=80;
		v1.front_brake="available";
		v1.rear_brake="available";
		v1.tyre_type="ceat";
		v1.head_lamp="available";
		v1.user_reviews="good";
		two_wheeler v2=new two_wheeler();
		v2.company="pulsar";
		v2.model="220";
		v2.mileage=70;
		v2.fuel_capacity=6;
		v2.displacement=90;
		v2.front_brake="available";
		v2.rear_brake="available";
		v2.tyre_type="MRF";
		v2.head_lamp="available";
		v2.user_reviews="super";
		two_wheeler v3=new two_wheeler();
		v3.company="Hero";
		v3.model="HF deluxe";
		v3.mileage=80;
		v3.fuel_capacity=6;
		v3.displacement=100;
		v3.front_brake="available";
		v3.rear_brake="available";
		v3.tyre_type="ceat";
		v3.head_lamp="available";
		v3.user_reviews="ok";
		two_wheeler v4=new two_wheeler();
		v4.company="Royal Enfield";
		v4.model="M22";
		v4.mileage=50;
		v4.fuel_capacity=5;
		v4.displacement=70;
		v4.front_brake="available";
		v4.rear_brake="available";
		v4.tyre_type="MRF";
		v4.head_lamp="available";
		v4.user_reviews="EXcellent";
		
					System.out.println("Company"+"			"+"Model"+"		"+"Mileage"+"		"+"Fuel_capacity"+"		"+"displacement"+"		"+"front_break"+"		"+"rear_brake"+"		"+"tyre_type"+"		"+"head_lamp"+"	"+"user_reviews");
		v1.display();
		System.out.println();
		v2.display();
		System.out.println();
		v3.display();
		System.out.println();
		v4.display();
		System.out.println();
		
		
		System.out.println("Four wheelers:");
		four_wheeler v11=new four_wheeler();
		v11.company="Maruthi";
		v11.model="ms109";
		v11.mileage=15;
		v11.fuel_capacity=10;
		v11.displacement=20;
		v11.air_conditioner=true;
		v11.air_bags=false;
		v11.power_steering=false;
		v11.rain_sensing_wiper=false;
		
		four_wheeler v22=new four_wheeler();
		v22.company="Benz";
		v22.model="ultra";
		v22.mileage=20;
		v22.fuel_capacity=15;
		v22.displacement=25;
		v22.air_conditioner=true;
		v22.air_bags=true;
		v22.power_steering=true;
		v22.rain_sensing_wiper=true;
		
		four_wheeler v33=new four_wheeler();
		v33.company="Nano";
		v33.model="mini";
		v33.mileage=15;
		v33.fuel_capacity=10;
		v33.displacement=20;
		v33.air_conditioner=false;
		v33.air_bags=false;
		v33.power_steering=false;
		v33.rain_sensing_wiper=true;
		
		four_wheeler v44=new four_wheeler();
		v44.company="swift";
		v44.model="ultra";
		v44.mileage=20;
		v44.fuel_capacity=15;
		v44.displacement=25;
		v44.air_conditioner=true;
		v44.air_bags=true;
		v44.power_steering=true;
		v44.rain_sensing_wiper=true;
		
		System.out.println();	System.out.println("Company"+"			"+"Model"+"		"+"Mileage"+"		"+"Fuel_capacity"+"		"+"displacement"+"		"+"air_conditioner"+"		"+"air_bags"+"		"+"power_steering"+"		"+"rain_sensing_wiper");
		v11.display();
		System.out.println();
		v22.display();
		System.out.println();
		v33.display();
		System.out.println();
		v44.display();
		System.out.println();
		
		System.out.println("Select the vehicle enter 2 for two-wheeler and 4 for four-wheeler:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==2){
		System.out.println("Enter the two vehicles name that you want to compare:");	
		}
	}
}
