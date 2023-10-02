package class21;

public abstract class Animal {

    abstract void speak();

    abstract void sleep();
    abstract void eat();
    }

class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("Wuff Wuff Wuff");
    }
    @Override
    void sleep() {
        System.out.println("Sleeping for last 10 hours.......");
    }

    @Override
    void eat() {
        System.out.println("Eating bones.....");
    }
}
class Cat extends Animal{
    @Override
    void speak(){
        System.out.println("Meaw Meaw Meaw");
    }
    @Override
    void sleep() {
        System.out.println("Sleeping for last 16 hours.......");
    }

    @Override
    void eat() {
        System.out.println("Eating catfood.....");
    }}