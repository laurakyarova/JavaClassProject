package class18;

public class Bird {

    String name;
    String color;
    String origin;
    int age;
    public Bird(String name,String color,String origin,int age){
        this.name=name;
        this.color=color;
        this.origin=origin;
        this.age=age;
    }
    public void printInfo(){
        System.out.println(name+" "+color+" "+origin+" "+age);
    }
}
class Sparrow extends Bird{
    String size;
    public Sparrow(String name,String color,String origin,int age,String size){
        super(name, color, origin, age);
        this.size=size;
    }
}
class Parrot extends Bird{
    public Parrot(String name,String color,String origin,int age){
        super(name, color, origin, age);
    }
}
class BirdTester{
    Sparrow brd=new Sparrow("chuchi","pink","asia",2,"small");



}
