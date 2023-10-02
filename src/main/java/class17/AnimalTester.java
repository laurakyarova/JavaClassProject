package class17;

public class AnimalTester {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.name="Tom";
        c.breed="Russian";
        c.color="blue";
        c.age=6;
        c.attitude=true;
        c.printInfo();
        Dog d=new Dog();
        d.bark();
        d.name="Tuzik";
        d.breed="German";
        d.printInfo();
        Animal a=new Animal();
        a.name="Shurik";
        a.color="pink";
        a.printInfo();
    }
}
