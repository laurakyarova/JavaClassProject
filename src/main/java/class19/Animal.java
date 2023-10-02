package class19;

public class Animal {
    private String name;
    private String color;
    private int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void printInfo() {
        System.out.print(name + " " + color + " " + age+" ");
    }
}
    class Dog extends Animal{

        double weight;

        public Dog(String name, String color, int age,double weight) {
            super(name, color, age);
            this.weight=weight;
        }
        public void printInfo(){
            super.printInfo();
            System.out.println(weight);

}}
