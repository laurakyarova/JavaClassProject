package class10;

public class DogTester {
    public static void main(String[] args) {
//Creating on obj from the dog class
        Dog lunaObj=new Dog();
 //assigning a value to name using lunaObj
        lunaObj.name="Luna";
        lunaObj.gender="F";
        lunaObj.breed="Shiba";
        lunaObj.weight=10;
        lunaObj.age=7;
        System.out.println(lunaObj.name);
        System.out.println(lunaObj.gender);
        System.out.println(lunaObj.breed);

//we are calling the bark method on lunaObj
        lunaObj.bark();
//we are calling the eat method on lunaObj
        lunaObj.eat();
//we are calling the sleep method on lunaObj
        lunaObj.sleep();

    }


    
}
