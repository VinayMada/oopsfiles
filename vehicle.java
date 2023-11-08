class Vehicle {
private String vehicleNumber;
private String insuranceNumber;
private String color;

public Vehicle(String vehicleNumber, String insuranceNumber, String color) {
this.vehicleNumber = vehicleNumber;
this.insuranceNumber = insuranceNumber;
this.color = color;
}

public void getConsumption() {
// Implementation for getting consumption
}

public void displayConsumption() {
// Implementation for displaying consumption
}
}
class TwoWheeler extends Vehicle {
public TwoWheeler(String vehicleNumber, String insuranceNumber, String color) {
super(vehicleNumber, insuranceNumber, color);
}

public void maintenance() {
// Implementation for maintenance of TwoWheeler
}

public void average() {
// Implementation for calculating average of TwoWheeler
}
}
class FourWheeler extends Vehicle {
public FourWheeler(String vehicleNumber, String insuranceNumber, String color) {
super(vehicleNumber, insuranceNumber, color);
}

public void maintenance() {
// Implementation for maintenance of FourWheeler
}

public void average() {
// Implementation for calculating average of FourWheeler
}
}
public class vehicle {
public static void main(String[] args) {
TwoWheeler twoWheeler = new TwoWheeler("TW123", "INS123", "Red");
twoWheeler.getConsumption();
twoWheeler.displayConsumption();
twoWheeler.maintenance();
twoWheeler.average();

FourWheeler fourWheeler = new FourWheeler("FW123", "INS456", "Blue");
fourWheeler.getConsumption();
fourWheeler.displayConsumption();
fourWheeler.maintenance();
fourWheeler.average();
}
}
