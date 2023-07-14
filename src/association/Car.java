package association;

public class Car {
    String carName;
    String color;
    String model;
    Engine engine;
    MPlayer mPlayer;

    public Car(String carName, String color, String model, Engine engine, MPlayer mPlayer) {
        this.carName = carName;
        this.color = color;
        this.model = model;
        this.engine = engine;
        this.mPlayer = mPlayer;
    }
    void display(){
        System.out.println("Car Name " +carName);
        System.out.println("Model " + model);
        System.out.println("color" +color);
        System.out.println("Chassis No " +engine.chassisNo);
        System.out.println("HP " +engine.hp);
        System.out.println("Media Player " +mPlayer);
    }
}
class Engine{
    String chassisNo;
    int hp;

    public Engine(String chassisNo, int hp) {
        this.chassisNo = chassisNo;
        this.hp = hp;
    }
}
class MPlayer{
   String companyName;

    public MPlayer(String companyName) {
        this.companyName = companyName;
    }
}
class  CarImpl{
    public static void main(String[] args) {
        MPlayer mPlayer =new MPlayer("JBN");
        Engine engine=new Engine("APDk",300);
        Car car =new Car("Harrier","black","sport",engine,mPlayer);
        car.display();
    }
}
