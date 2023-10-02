package class16;

public class DogTask {
    private String name;
    private int age;
    private String color;
    private String breed;

    private DogTask(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public DogTask(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

     DogTask(String name, int age, String color, String breed) {
        this(name,age,color);
        this.breed = breed;
    }


    protected DogTask(){


    }
    public void printInfo(){
        System.out.println(name+" "+age+" "+color+" "+breed);
    }

    public static void main(String[] args) {
        new DogTask("Tuzik",10).printInfo();
    }
}
