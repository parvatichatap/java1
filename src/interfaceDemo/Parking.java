package interfaceDemo;

public interface Parking {

}
class TwoWheeler implements Parking{
    void display(){
        System.out.println("in two Wheeler");
    }

}
class FourWheeler {
    void display(){
        System.out.println("in Four Wheeler");
    }
}
class ParkingImpl{
    public static void main(String[] args) {
        TwoWheeler twoWheeler=new TwoWheeler();
        if(twoWheeler instanceof Parking){
            System.out.println("Allowed");
            twoWheeler.display();
        }

        FourWheeler fourWheeler=new FourWheeler();
        if(fourWheeler instanceof  Parking){
            System.out.println("Allowed");
            fourWheeler.display();
        }


    }
}