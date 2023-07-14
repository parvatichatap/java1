package interfaceDemo;

public interface Vehicle  extends Engine{
    String chassisNo ="";
    void ApplyBrakes();
    void speedUpDown();
    void getNoGears();


}
interface MediaPlayer{
    boolean hasMediaPlayer();
}
interface  Engine{
    String getEngineType();
}
class Car implements  Vehicle,MediaPlayer{


    @Override
    public void ApplyBrakes() {
        System.out.println("in apply brakes");

    }

    @Override
    public void speedUpDown() {
        System.out.println("in speed up down");

    }

    @Override
    public void getNoGears() {
        System.out.println("in get no gears");
    }

    @Override
    public boolean hasMediaPlayer() {
        return true;
    }

    @Override
    public String getEngineType() {
        return "BS6";
    }

}
class Bike implements  Vehicle{

    @Override
    public void ApplyBrakes() {
        System.out.println("in apply brakes");
    }

    @Override
    public void speedUpDown() {
        System.out.println("in speed up down");
    }

    @Override
    public void getNoGears() {
        System.out.println("get no of gears");
    }

    @Override
    public String getEngineType() {
        return "BS4";
    }
}
class VehicleImpl{
    public static void main(String[] args) {
        Vehicle vehicle1;//
        vehicle1=new Car();
        vehicle1.ApplyBrakes();
        vehicle1.getNoGears();
        vehicle1.speedUpDown();
        System.out.println(vehicle1.getEngineType());
        MediaPlayer mediaPlayer=new Car();
        System.out.println(mediaPlayer.hasMediaPlayer());

    }
}

