package class13;

public class DogTester {
    public static void main(String[] args) {

        Dog d1=new Dog();
        d1.name="Picho";
        d1.breed="Persian";
        d1.age=10;

        Dog d2=new Dog();
        d2.name="Papi";
        d2.breed="German";
        d2.age=3;
        d1.printInfo();
        d2.printInfo();
        d1.changeName("Belka");
    }

}
