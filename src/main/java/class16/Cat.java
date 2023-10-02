package class16;

public class Cat{
    private String name;
    private int age;
    private String color;
    private String breed;
    private double weight;

    public Cat(String name,int age,String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Cat(String name,int age,String color,String breed) {
        this(name,age,color);
        this.breed = breed;
    }


    public Cat(String name,int age,String color,String breed,double weight){
        this(name,age,color,breed);
        this.weight=weight;

    }
    public void printInfo(){
        System.out.println(name+" "+age+" "+color+" "+breed+" "+weight);
    }
}
