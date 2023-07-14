package thiskeyword;

public class Vehicle
{
    int wheels;
    String brandName;
    String vehicleType;
    Vehicle(int wheels, String brandName,String vehicleType){
        this.wheels=wheels;
        this.brandName=brandName;
        this.vehicleType=vehicleType;
    }
    void display(){
        System.out.println("Wheels: "+wheels);
        System.out.println("Brand Name : "+brandName);
        System.out.println("Vehicle Type: "+vehicleType);
    }
}
class VehicleImpl{
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle(2,"honda","Bike");
        vehicle.display();

    }
}
