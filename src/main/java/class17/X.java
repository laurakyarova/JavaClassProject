package class17;

public class X {
    String name;
    void printName(){
        System.out.println(name);
    }
}
class Y extends X{
    String color;
    void printColor(){
        System.out.println(color);
    }
}
class Z extends Y{
    int age;
    void printAge(){
        System.out.println(age);
    }

}
