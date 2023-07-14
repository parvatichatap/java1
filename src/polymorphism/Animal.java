package polymorphism;

public class Animal {
    String breed= "Any";
    void run(){
        System.out.println("in main method");
    }

}
class Dog extends Animal {
    String breed = "German Shepard";

    void run() {
        System.out.println("in dog run method");
    }


    public static void main(String[] args) {
Animal animal=new Dog();
animal=new Dog();
animal.run();
        System.out.println(animal.breed);
    }
}
